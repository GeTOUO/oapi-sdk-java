// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class Sender {
    /**
     * 该字段标识发送者的id
     * <p> 示例值：cli_9f427eec54ae901b
     */
    @SerializedName("id")
    private String id;
    /**
     * 该字段标识发送者的id类型;;**可选值有：**;- `open_id`;- `app_id`
     * <p> 示例值：app_id
     */
    @SerializedName("id_type")
    private String idType;
    /**
     * 该字段标识发送者的类型;;**可选值有：**;- `user`: 用户;- `app`: 应用;- `anonymous`: 匿名;- `unknown`: 未知
     * <p> 示例值：app
     */
    @SerializedName("sender_type")
    private String senderType;
    /**
     * 为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
     * <p> 示例值：736588c9260f175e
     */
    @SerializedName("tenant_key")
    private String tenantKey;

    // builder 开始
    public Sender() {
    }

    public Sender(Builder builder) {
        /**
         * 该字段标识发送者的id
         * <p> 示例值：cli_9f427eec54ae901b
         */
        this.id = builder.id;
        /**
         * 该字段标识发送者的id类型;;**可选值有：**;- `open_id`;- `app_id`
         * <p> 示例值：app_id
         */
        this.idType = builder.idType;
        /**
         * 该字段标识发送者的类型;;**可选值有：**;- `user`: 用户;- `app`: 应用;- `anonymous`: 匿名;- `unknown`: 未知
         * <p> 示例值：app
         */
        this.senderType = builder.senderType;
        /**
         * 为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        this.tenantKey = builder.tenantKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdType() {
        return this.idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getSenderType() {
        return this.senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public static class Builder {
        /**
         * 该字段标识发送者的id
         * <p> 示例值：cli_9f427eec54ae901b
         */
        private String id;
        /**
         * 该字段标识发送者的id类型;;**可选值有：**;- `open_id`;- `app_id`
         * <p> 示例值：app_id
         */
        private String idType;
        /**
         * 该字段标识发送者的类型;;**可选值有：**;- `user`: 用户;- `app`: 应用;- `anonymous`: 匿名;- `unknown`: 未知
         * <p> 示例值：app
         */
        private String senderType;
        /**
         * 为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        private String tenantKey;

        /**
         * 该字段标识发送者的id
         * <p> 示例值：cli_9f427eec54ae901b
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 该字段标识发送者的id类型;;**可选值有：**;- `open_id`;- `app_id`
         * <p> 示例值：app_id
         *
         * @param idType
         * @return
         */
        public Builder idType(String idType) {
            this.idType = idType;
            return this;
        }


        /**
         * 该字段标识发送者的类型;;**可选值有：**;- `user`: 用户;- `app`: 应用;- `anonymous`: 匿名;- `unknown`: 未知
         * <p> 示例值：app
         *
         * @param senderType
         * @return
         */
        public Builder senderType(String senderType) {
            this.senderType = senderType;
            return this;
        }


        /**
         * 为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         *
         * @param tenantKey
         * @return
         */
        public Builder tenantKey(String tenantKey) {
            this.tenantKey = tenantKey;
            return this;
        }


        public Sender build() {
            return new Sender(this);
        }
    }
}
