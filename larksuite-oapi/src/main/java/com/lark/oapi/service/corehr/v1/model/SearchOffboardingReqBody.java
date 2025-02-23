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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class SearchOffboardingReqBody {
    /**
     * 雇佣 ID 列表，为空默认查询所有离职人员
     * <p> 示例值：
     */
    @SerializedName("employment_ids")
    private String[] employmentIds;
    /**
     * 离职审批发起时间-搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2022-01-01 11:22:33
     */
    @SerializedName("apply_initiating_time_start")
    private String applyInitiatingTimeStart;
    /**
     * 离职审批发起时间 - 搜索范围结束
     * <p> 示例值：2022-01-01 11:22:33
     */
    @SerializedName("apply_initiating_time_end")
    private String applyInitiatingTimeEnd;
    /**
     * 期望离职日期-搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2022-01-01
     */
    @SerializedName("expected_offboarding_date_start")
    private String expectedOffboardingDateStart;
    /**
     * 期望离职日期 - 搜索范围结束
     * <p> 示例值：2022-01-01
     */
    @SerializedName("expected_offboarding_date_end")
    private String expectedOffboardingDateEnd;
    /**
     * 离职日期-搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2022-01-01
     */
    @SerializedName("offboarding_date_start")
    private String offboardingDateStart;
    /**
     * 离职日期 - 搜索范围结束
     * <p> 示例值：2022-01-01
     */
    @SerializedName("offboarding_date_end")
    private String offboardingDateEnd;
    /**
     * 离职状态，多个状态之间为「或」的关系
     * <p> 示例值：
     */
    @SerializedName("statuses")
    private String[] statuses;
    /**
     * 离职原因列表 , 可以通过【查询员工离职原因列表】接口获取 ，查询时不返回下级原因相关的离职信息
     * <p> 示例值：
     */
    @SerializedName("reasons")
    private String[] reasons;
    /**
     * 离职原因（员工）列表 , 可以通过【查询员工离职原因列表】接口获取，查询时不返回下级原因相关的离职信息
     * <p> 示例值：
     */
    @SerializedName("employee_reasons")
    private String[] employeeReasons;

    // builder 开始
    public SearchOffboardingReqBody() {
    }

    public SearchOffboardingReqBody(Builder builder) {
        /**
         * 雇佣 ID 列表，为空默认查询所有离职人员
         * <p> 示例值：
         */
        this.employmentIds = builder.employmentIds;
        /**
         * 离职审批发起时间-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01 11:22:33
         */
        this.applyInitiatingTimeStart = builder.applyInitiatingTimeStart;
        /**
         * 离职审批发起时间 - 搜索范围结束
         * <p> 示例值：2022-01-01 11:22:33
         */
        this.applyInitiatingTimeEnd = builder.applyInitiatingTimeEnd;
        /**
         * 期望离职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01
         */
        this.expectedOffboardingDateStart = builder.expectedOffboardingDateStart;
        /**
         * 期望离职日期 - 搜索范围结束
         * <p> 示例值：2022-01-01
         */
        this.expectedOffboardingDateEnd = builder.expectedOffboardingDateEnd;
        /**
         * 离职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01
         */
        this.offboardingDateStart = builder.offboardingDateStart;
        /**
         * 离职日期 - 搜索范围结束
         * <p> 示例值：2022-01-01
         */
        this.offboardingDateEnd = builder.offboardingDateEnd;
        /**
         * 离职状态，多个状态之间为「或」的关系
         * <p> 示例值：
         */
        this.statuses = builder.statuses;
        /**
         * 离职原因列表 , 可以通过【查询员工离职原因列表】接口获取 ，查询时不返回下级原因相关的离职信息
         * <p> 示例值：
         */
        this.reasons = builder.reasons;
        /**
         * 离职原因（员工）列表 , 可以通过【查询员工离职原因列表】接口获取，查询时不返回下级原因相关的离职信息
         * <p> 示例值：
         */
        this.employeeReasons = builder.employeeReasons;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getEmploymentIds() {
        return this.employmentIds;
    }

    public void setEmploymentIds(String[] employmentIds) {
        this.employmentIds = employmentIds;
    }

    public String getApplyInitiatingTimeStart() {
        return this.applyInitiatingTimeStart;
    }

    public void setApplyInitiatingTimeStart(String applyInitiatingTimeStart) {
        this.applyInitiatingTimeStart = applyInitiatingTimeStart;
    }

    public String getApplyInitiatingTimeEnd() {
        return this.applyInitiatingTimeEnd;
    }

    public void setApplyInitiatingTimeEnd(String applyInitiatingTimeEnd) {
        this.applyInitiatingTimeEnd = applyInitiatingTimeEnd;
    }

    public String getExpectedOffboardingDateStart() {
        return this.expectedOffboardingDateStart;
    }

    public void setExpectedOffboardingDateStart(String expectedOffboardingDateStart) {
        this.expectedOffboardingDateStart = expectedOffboardingDateStart;
    }

    public String getExpectedOffboardingDateEnd() {
        return this.expectedOffboardingDateEnd;
    }

    public void setExpectedOffboardingDateEnd(String expectedOffboardingDateEnd) {
        this.expectedOffboardingDateEnd = expectedOffboardingDateEnd;
    }

    public String getOffboardingDateStart() {
        return this.offboardingDateStart;
    }

    public void setOffboardingDateStart(String offboardingDateStart) {
        this.offboardingDateStart = offboardingDateStart;
    }

    public String getOffboardingDateEnd() {
        return this.offboardingDateEnd;
    }

    public void setOffboardingDateEnd(String offboardingDateEnd) {
        this.offboardingDateEnd = offboardingDateEnd;
    }

    public String[] getStatuses() {
        return this.statuses;
    }

    public void setStatuses(String[] statuses) {
        this.statuses = statuses;
    }

    public String[] getReasons() {
        return this.reasons;
    }

    public void setReasons(String[] reasons) {
        this.reasons = reasons;
    }

    public String[] getEmployeeReasons() {
        return this.employeeReasons;
    }

    public void setEmployeeReasons(String[] employeeReasons) {
        this.employeeReasons = employeeReasons;
    }

    public static class Builder {
        /**
         * 雇佣 ID 列表，为空默认查询所有离职人员
         * <p> 示例值：
         */
        private String[] employmentIds;
        /**
         * 离职审批发起时间-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01 11:22:33
         */
        private String applyInitiatingTimeStart;
        /**
         * 离职审批发起时间 - 搜索范围结束
         * <p> 示例值：2022-01-01 11:22:33
         */
        private String applyInitiatingTimeEnd;
        /**
         * 期望离职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01
         */
        private String expectedOffboardingDateStart;
        /**
         * 期望离职日期 - 搜索范围结束
         * <p> 示例值：2022-01-01
         */
        private String expectedOffboardingDateEnd;
        /**
         * 离职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01
         */
        private String offboardingDateStart;
        /**
         * 离职日期 - 搜索范围结束
         * <p> 示例值：2022-01-01
         */
        private String offboardingDateEnd;
        /**
         * 离职状态，多个状态之间为「或」的关系
         * <p> 示例值：
         */
        private String[] statuses;
        /**
         * 离职原因列表 , 可以通过【查询员工离职原因列表】接口获取 ，查询时不返回下级原因相关的离职信息
         * <p> 示例值：
         */
        private String[] reasons;
        /**
         * 离职原因（员工）列表 , 可以通过【查询员工离职原因列表】接口获取，查询时不返回下级原因相关的离职信息
         * <p> 示例值：
         */
        private String[] employeeReasons;

        /**
         * 雇佣 ID 列表，为空默认查询所有离职人员
         * <p> 示例值：
         *
         * @param employmentIds
         * @return
         */
        public Builder employmentIds(String[] employmentIds) {
            this.employmentIds = employmentIds;
            return this;
        }


        /**
         * 离职审批发起时间-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01 11:22:33
         *
         * @param applyInitiatingTimeStart
         * @return
         */
        public Builder applyInitiatingTimeStart(String applyInitiatingTimeStart) {
            this.applyInitiatingTimeStart = applyInitiatingTimeStart;
            return this;
        }


        /**
         * 离职审批发起时间 - 搜索范围结束
         * <p> 示例值：2022-01-01 11:22:33
         *
         * @param applyInitiatingTimeEnd
         * @return
         */
        public Builder applyInitiatingTimeEnd(String applyInitiatingTimeEnd) {
            this.applyInitiatingTimeEnd = applyInitiatingTimeEnd;
            return this;
        }


        /**
         * 期望离职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01
         *
         * @param expectedOffboardingDateStart
         * @return
         */
        public Builder expectedOffboardingDateStart(String expectedOffboardingDateStart) {
            this.expectedOffboardingDateStart = expectedOffboardingDateStart;
            return this;
        }


        /**
         * 期望离职日期 - 搜索范围结束
         * <p> 示例值：2022-01-01
         *
         * @param expectedOffboardingDateEnd
         * @return
         */
        public Builder expectedOffboardingDateEnd(String expectedOffboardingDateEnd) {
            this.expectedOffboardingDateEnd = expectedOffboardingDateEnd;
            return this;
        }


        /**
         * 离职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2022-01-01
         *
         * @param offboardingDateStart
         * @return
         */
        public Builder offboardingDateStart(String offboardingDateStart) {
            this.offboardingDateStart = offboardingDateStart;
            return this;
        }


        /**
         * 离职日期 - 搜索范围结束
         * <p> 示例值：2022-01-01
         *
         * @param offboardingDateEnd
         * @return
         */
        public Builder offboardingDateEnd(String offboardingDateEnd) {
            this.offboardingDateEnd = offboardingDateEnd;
            return this;
        }


        /**
         * 离职状态，多个状态之间为「或」的关系
         * <p> 示例值：
         *
         * @param statuses
         * @return
         */
        public Builder statuses(String[] statuses) {
            this.statuses = statuses;
            return this;
        }


        /**
         * 离职原因列表 , 可以通过【查询员工离职原因列表】接口获取 ，查询时不返回下级原因相关的离职信息
         * <p> 示例值：
         *
         * @param reasons
         * @return
         */
        public Builder reasons(String[] reasons) {
            this.reasons = reasons;
            return this;
        }


        /**
         * 离职原因（员工）列表 , 可以通过【查询员工离职原因列表】接口获取，查询时不返回下级原因相关的离职信息
         * <p> 示例值：
         *
         * @param employeeReasons
         * @return
         */
        public Builder employeeReasons(String[] employeeReasons) {
            this.employeeReasons = employeeReasons;
            return this;
        }


        public SearchOffboardingReqBody build() {
            return new SearchOffboardingReqBody(this);
        }
    }
}
