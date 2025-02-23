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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class EcoExamResultDetail {
    /**
     * 评价 ID
     * <p> 示例值：pj001
     */
    @SerializedName("id")
    private String id;
    /**
     * 评价名称
     * <p> 示例值：基本功
     */
    @SerializedName("name")
    private String name;
    /**
     * 评价结果
     * <p> 示例值：优秀
     */
    @SerializedName("result")
    private String result;

    // builder 开始
    public EcoExamResultDetail() {
    }

    public EcoExamResultDetail(Builder builder) {
        /**
         * 评价 ID
         * <p> 示例值：pj001
         */
        this.id = builder.id;
        /**
         * 评价名称
         * <p> 示例值：基本功
         */
        this.name = builder.name;
        /**
         * 评价结果
         * <p> 示例值：优秀
         */
        this.result = builder.result;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static class Builder {
        /**
         * 评价 ID
         * <p> 示例值：pj001
         */
        private String id;
        /**
         * 评价名称
         * <p> 示例值：基本功
         */
        private String name;
        /**
         * 评价结果
         * <p> 示例值：优秀
         */
        private String result;

        /**
         * 评价 ID
         * <p> 示例值：pj001
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 评价名称
         * <p> 示例值：基本功
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 评价结果
         * <p> 示例值：优秀
         *
         * @param result
         * @return
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }


        public EcoExamResultDetail build() {
            return new EcoExamResultDetail(this);
        }
    }
}
