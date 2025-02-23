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
package com.lark.oapi.okhttp.internal.connection;

import com.lark.oapi.okhttp.internal.Util;

import java.io.IOException;

/**
 * An exception thrown to indicate a problem connecting via a single Route. Multiple attempts may
 * have been made with alternative protocols, none of which were successful.
 */
public final class RouteException extends RuntimeException {

    private IOException firstException;
    private IOException lastException;

    RouteException(IOException cause) {
        super(cause);
        firstException = cause;
        lastException = cause;
    }

    public IOException getFirstConnectException() {
        return firstException;
    }

    public IOException getLastConnectException() {
        return lastException;
    }

    void addConnectException(IOException e) {
        Util.addSuppressedIfPossible(firstException, e);
        lastException = e;
    }
}
