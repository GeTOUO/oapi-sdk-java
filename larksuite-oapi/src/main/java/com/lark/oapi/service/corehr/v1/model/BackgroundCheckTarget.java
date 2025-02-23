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

public class BackgroundCheckTarget {
    /**
     * 背调对象ID
     * <p> 示例值：
     */
    @SerializedName("id")
    private String id;
    /**
     * 姓
     * <p> 示例值：
     */
    @SerializedName("first_name")
    private String firstName;
    /**
     * 名
     * <p> 示例值：
     */
    @SerializedName("last_name")
    private String lastName;
    /**
     * 邮箱
     * <p> 示例值：
     */
    @SerializedName("email")
    private String email;
    /**
     * 工作国家
     * <p> 示例值：
     */
    @SerializedName("work_country")
    private BackgroundCheckCountry workCountry;
    /**
     * 工作城市
     * <p> 示例值：
     */
    @SerializedName("work_city")
    private BackgroundCheckCity workCity;
    /**
     * 职称
     * <p> 示例值：
     */
    @SerializedName("job_title")
    private String jobTitle;
    /**
     * offer HR的电子邮件
     * <p> 示例值：
     */
    @SerializedName("offer_hr_email")
    private String offerHrEmail;
    /**
     * 业务单元
     * <p> 示例值：
     */
    @SerializedName("biz_unit")
    private String bizUnit;
    /**
     * offer HR的部门ID
     * <p> 示例值：
     */
    @SerializedName("offer_hr_department_id")
    private String offerHrDepartmentId;

    // builder 开始
    public BackgroundCheckTarget() {
    }

    public BackgroundCheckTarget(Builder builder) {
        /**
         * 背调对象ID
         * <p> 示例值：
         */
        this.id = builder.id;
        /**
         * 姓
         * <p> 示例值：
         */
        this.firstName = builder.firstName;
        /**
         * 名
         * <p> 示例值：
         */
        this.lastName = builder.lastName;
        /**
         * 邮箱
         * <p> 示例值：
         */
        this.email = builder.email;
        /**
         * 工作国家
         * <p> 示例值：
         */
        this.workCountry = builder.workCountry;
        /**
         * 工作城市
         * <p> 示例值：
         */
        this.workCity = builder.workCity;
        /**
         * 职称
         * <p> 示例值：
         */
        this.jobTitle = builder.jobTitle;
        /**
         * offer HR的电子邮件
         * <p> 示例值：
         */
        this.offerHrEmail = builder.offerHrEmail;
        /**
         * 业务单元
         * <p> 示例值：
         */
        this.bizUnit = builder.bizUnit;
        /**
         * offer HR的部门ID
         * <p> 示例值：
         */
        this.offerHrDepartmentId = builder.offerHrDepartmentId;
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

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BackgroundCheckCountry getWorkCountry() {
        return this.workCountry;
    }

    public void setWorkCountry(BackgroundCheckCountry workCountry) {
        this.workCountry = workCountry;
    }

    public BackgroundCheckCity getWorkCity() {
        return this.workCity;
    }

    public void setWorkCity(BackgroundCheckCity workCity) {
        this.workCity = workCity;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfferHrEmail() {
        return this.offerHrEmail;
    }

    public void setOfferHrEmail(String offerHrEmail) {
        this.offerHrEmail = offerHrEmail;
    }

    public String getBizUnit() {
        return this.bizUnit;
    }

    public void setBizUnit(String bizUnit) {
        this.bizUnit = bizUnit;
    }

    public String getOfferHrDepartmentId() {
        return this.offerHrDepartmentId;
    }

    public void setOfferHrDepartmentId(String offerHrDepartmentId) {
        this.offerHrDepartmentId = offerHrDepartmentId;
    }

    public static class Builder {
        /**
         * 背调对象ID
         * <p> 示例值：
         */
        private String id;
        /**
         * 姓
         * <p> 示例值：
         */
        private String firstName;
        /**
         * 名
         * <p> 示例值：
         */
        private String lastName;
        /**
         * 邮箱
         * <p> 示例值：
         */
        private String email;
        /**
         * 工作国家
         * <p> 示例值：
         */
        private BackgroundCheckCountry workCountry;
        /**
         * 工作城市
         * <p> 示例值：
         */
        private BackgroundCheckCity workCity;
        /**
         * 职称
         * <p> 示例值：
         */
        private String jobTitle;
        /**
         * offer HR的电子邮件
         * <p> 示例值：
         */
        private String offerHrEmail;
        /**
         * 业务单元
         * <p> 示例值：
         */
        private String bizUnit;
        /**
         * offer HR的部门ID
         * <p> 示例值：
         */
        private String offerHrDepartmentId;

        /**
         * 背调对象ID
         * <p> 示例值：
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 姓
         * <p> 示例值：
         *
         * @param firstName
         * @return
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }


        /**
         * 名
         * <p> 示例值：
         *
         * @param lastName
         * @return
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 工作国家
         * <p> 示例值：
         *
         * @param workCountry
         * @return
         */
        public Builder workCountry(BackgroundCheckCountry workCountry) {
            this.workCountry = workCountry;
            return this;
        }


        /**
         * 工作城市
         * <p> 示例值：
         *
         * @param workCity
         * @return
         */
        public Builder workCity(BackgroundCheckCity workCity) {
            this.workCity = workCity;
            return this;
        }


        /**
         * 职称
         * <p> 示例值：
         *
         * @param jobTitle
         * @return
         */
        public Builder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }


        /**
         * offer HR的电子邮件
         * <p> 示例值：
         *
         * @param offerHrEmail
         * @return
         */
        public Builder offerHrEmail(String offerHrEmail) {
            this.offerHrEmail = offerHrEmail;
            return this;
        }


        /**
         * 业务单元
         * <p> 示例值：
         *
         * @param bizUnit
         * @return
         */
        public Builder bizUnit(String bizUnit) {
            this.bizUnit = bizUnit;
            return this;
        }


        /**
         * offer HR的部门ID
         * <p> 示例值：
         *
         * @param offerHrDepartmentId
         * @return
         */
        public Builder offerHrDepartmentId(String offerHrDepartmentId) {
            this.offerHrDepartmentId = offerHrDepartmentId;
            return this;
        }


        public BackgroundCheckTarget build() {
            return new BackgroundCheckTarget(this);
        }
    }
}
