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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;

public class User {
    /**
     * 邮箱地址
     * <p> 示例值：aaa@lark.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 邮箱地址状态
     * <p> 示例值：4
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 邮箱地址类型
     * <p> 示例值：1
     */
    @SerializedName("type")
    private Integer type;

    // builder 开始
    public User() {
    }

    public User(Builder builder) {
        /**
         * 邮箱地址
         * <p> 示例值：aaa@lark.com
         */
        this.email = builder.email;
        /**
         * 邮箱地址状态
         * <p> 示例值：4
         */
        this.status = builder.status;
        /**
         * 邮箱地址类型
         * <p> 示例值：1
         */
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * 邮箱地址
         * <p> 示例值：aaa@lark.com
         */
        private String email;
        /**
         * 邮箱地址状态
         * <p> 示例值：4
         */
        private Integer status;
        /**
         * 邮箱地址类型
         * <p> 示例值：1
         */
        private Integer type;

        /**
         * 邮箱地址
         * <p> 示例值：aaa@lark.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 邮箱地址状态
         * <p> 示例值：4
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 邮箱地址状态
         * <p> 示例值：4
         *
         * @param status {@link com.lark.oapi.service.mail.v1.enums.UserUserStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.mail.v1.enums.UserUserStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 邮箱地址类型
         * <p> 示例值：1
         *
         * @param type
         * @return
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * 邮箱地址类型
         * <p> 示例值：1
         *
         * @param type {@link com.lark.oapi.service.mail.v1.enums.UserUserTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.mail.v1.enums.UserUserTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        public User build() {
            return new User(this);
        }
    }
}
