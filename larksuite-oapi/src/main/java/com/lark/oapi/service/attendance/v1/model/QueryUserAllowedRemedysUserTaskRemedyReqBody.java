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

package com.lark.oapi.service.attendance.v1.model;

import com.google.gson.annotations.SerializedName;

public class QueryUserAllowedRemedysUserTaskRemedyReqBody {
    /**
     * 用户 ID
     * <p> 示例值：abd754f7
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 补卡日期
     * <p> 示例值：20210104
     */
    @SerializedName("remedy_date")
    private Integer remedyDate;

    // builder 开始
    public QueryUserAllowedRemedysUserTaskRemedyReqBody() {
    }

    public QueryUserAllowedRemedysUserTaskRemedyReqBody(Builder builder) {
        /**
         * 用户 ID
         * <p> 示例值：abd754f7
         */
        this.userId = builder.userId;
        /**
         * 补卡日期
         * <p> 示例值：20210104
         */
        this.remedyDate = builder.remedyDate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getRemedyDate() {
        return this.remedyDate;
    }

    public void setRemedyDate(Integer remedyDate) {
        this.remedyDate = remedyDate;
    }

    public static class Builder {
        /**
         * 用户 ID
         * <p> 示例值：abd754f7
         */
        private String userId;
        /**
         * 补卡日期
         * <p> 示例值：20210104
         */
        private Integer remedyDate;

        /**
         * 用户 ID
         * <p> 示例值：abd754f7
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 补卡日期
         * <p> 示例值：20210104
         *
         * @param remedyDate
         * @return
         */
        public Builder remedyDate(Integer remedyDate) {
            this.remedyDate = remedyDate;
            return this;
        }


        public QueryUserAllowedRemedysUserTaskRemedyReqBody build() {
            return new QueryUserAllowedRemedysUserTaskRemedyReqBody(this);
        }
    }
}
