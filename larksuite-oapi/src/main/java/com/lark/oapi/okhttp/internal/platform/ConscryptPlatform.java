/*
 *
 *  * Copyright (C) 2015 Square, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.lark.oapi.okhttp.internal.platform;

import com.lark.oapi.okhttp.Protocol;
import org.conscrypt.Conscrypt;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;

/**
 * Platform using Conscrypt (conscrypt.org) if installed as the first Security Provider.
 * <p>
 * Requires org.conscrypt:conscrypt-openjdk-uber on the classpath.
 */
public class ConscryptPlatform extends Platform {

    private ConscryptPlatform() {
    }

    public static ConscryptPlatform buildIfSupported() {
        try {
            // Trigger an early exception over a fatal error, prefer a RuntimeException over Error.
            Class.forName("org.conscrypt.Conscrypt");

            if (!Conscrypt.isAvailable()) {
                return null;
            }

            return new ConscryptPlatform();
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    @SuppressWarnings("deprecation")
    private Provider getProvider() {
        // defaults to true, but allow for older versions of conscrypt if still compatible
        // new form with boolean is only present in >= 2.0.0
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override
    public @Nullable
    X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        if (!Conscrypt.isConscrypt(sslSocketFactory)) {
            return super.trustManager(sslSocketFactory);
        }

        try {
            // org.conscrypt.SSLParametersImpl
            Object sp =
                    readFieldOrNull(sslSocketFactory, Object.class, "sslParameters");

            if (sp != null) {
                return readFieldOrNull(sp, X509TrustManager.class, "x509TrustManager");
            }

            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException(
                    "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override
    public void configureTlsExtensions(
            SSLSocket sslSocket, String hostname, List<Protocol> protocols) throws IOException {
        if (Conscrypt.isConscrypt(sslSocket)) {
            // Enable SNI and session tickets.
            if (hostname != null) {
                Conscrypt.setUseSessionTickets(sslSocket, true);
                Conscrypt.setHostname(sslSocket, hostname);
            }

            // Enable ALPN.
            List<String> names = alpnProtocolNames(protocols);
            Conscrypt.setApplicationProtocols(sslSocket, names.toArray(new String[0]));
        } else {
            super.configureTlsExtensions(sslSocket, hostname, protocols);
        }
    }

    @Override
    public @Nullable
    String getSelectedProtocol(SSLSocket sslSocket) {
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        } else {
            return super.getSelectedProtocol(sslSocket);
        }
    }

    @Override
    public SSLContext getSSLContext() {
        try {
            return SSLContext.getInstance("TLSv1.3", getProvider());
        } catch (NoSuchAlgorithmException e) {
            try {
                // Allow for Conscrypt 1.2
                return SSLContext.getInstance("TLS", getProvider());
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override
    public void configureSslSocketFactory(SSLSocketFactory socketFactory) {
        if (Conscrypt.isConscrypt(socketFactory)) {
            Conscrypt.setUseEngineSocket(socketFactory, true);
        }
    }
}
