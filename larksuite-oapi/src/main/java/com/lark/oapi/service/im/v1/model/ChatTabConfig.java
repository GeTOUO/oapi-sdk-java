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

public class ChatTabConfig {
    /**
     * 群Tab图标
     * <p> 示例值：img_v2_b99741-7628-4abd-aad0-b881e4db83ig
     */
    @SerializedName("icon_key")
    private String iconKey;
    /**
     * 群tab是否App内嵌打开
     * <p> 示例值：false
     */
    @SerializedName("is_built_in")
    private Boolean isBuiltIn;

    // builder 开始
    public ChatTabConfig() {
    }

    public ChatTabConfig(Builder builder) {
        /**
         * 群Tab图标
         * <p> 示例值：img_v2_b99741-7628-4abd-aad0-b881e4db83ig
         */
        this.iconKey = builder.iconKey;
        /**
         * 群tab是否App内嵌打开
         * <p> 示例值：false
         */
        this.isBuiltIn = builder.isBuiltIn;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIconKey() {
        return this.iconKey;
    }

    public void setIconKey(String iconKey) {
        this.iconKey = iconKey;
    }

    public Boolean getIsBuiltIn() {
        return this.isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public static class Builder {
        /**
         * 群Tab图标
         * <p> 示例值：img_v2_b99741-7628-4abd-aad0-b881e4db83ig
         */
        private String iconKey;
        /**
         * 群tab是否App内嵌打开
         * <p> 示例值：false
         */
        private Boolean isBuiltIn;

        /**
         * 群Tab图标
         * <p> 示例值：img_v2_b99741-7628-4abd-aad0-b881e4db83ig
         *
         * @param iconKey
         * @return
         */
        public Builder iconKey(String iconKey) {
            this.iconKey = iconKey;
            return this;
        }


        /**
         * 群tab是否App内嵌打开
         * <p> 示例值：false
         *
         * @param isBuiltIn
         * @return
         */
        public Builder isBuiltIn(Boolean isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            return this;
        }


        public ChatTabConfig build() {
            return new ChatTabConfig(this);
        }
    }
}
