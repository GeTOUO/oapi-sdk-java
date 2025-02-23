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

public class CreateJobChangeReqBody {
    /**
     * 异动方式
     * <p> 示例值：2
     */
    @SerializedName("transfer_mode")
    private Integer transferMode;
    /**
     * 雇员id
     * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 异动类型唯一标识
     * <p> 示例值：internal_transfer
     */
    @SerializedName("transfer_type_unique_identifier")
    private String transferTypeUniqueIdentifier;
    /**
     * 异动流程ID
     * <p> 示例值：people_6963913041981490725_6983885526583627531
     */
    @SerializedName("flow_id")
    private String flowId;
    /**
     * 生效日期
     * <p> 示例值：2022-03-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 异动详细信息
     * <p> 示例值：
     */
    @SerializedName("transfer_info")
    private TransferInfo transferInfo;
    /**
     * 异动记录标识符
     * <p> 示例值：transfer_3627531
     */
    @SerializedName("transfer_key")
    private String transferKey;
    /**
     * 异动发起人 ID
     * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
     */
    @SerializedName("initiator_id")
    private String initiatorId;

    // builder 开始
    public CreateJobChangeReqBody() {
    }

    public CreateJobChangeReqBody(Builder builder) {
        /**
         * 异动方式
         * <p> 示例值：2
         */
        this.transferMode = builder.transferMode;
        /**
         * 雇员id
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         */
        this.employmentId = builder.employmentId;
        /**
         * 异动类型唯一标识
         * <p> 示例值：internal_transfer
         */
        this.transferTypeUniqueIdentifier = builder.transferTypeUniqueIdentifier;
        /**
         * 异动流程ID
         * <p> 示例值：people_6963913041981490725_6983885526583627531
         */
        this.flowId = builder.flowId;
        /**
         * 生效日期
         * <p> 示例值：2022-03-01
         */
        this.effectiveDate = builder.effectiveDate;
        /**
         * 异动详细信息
         * <p> 示例值：
         */
        this.transferInfo = builder.transferInfo;
        /**
         * 异动记录标识符
         * <p> 示例值：transfer_3627531
         */
        this.transferKey = builder.transferKey;
        /**
         * 异动发起人 ID
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         */
        this.initiatorId = builder.initiatorId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getTransferMode() {
        return this.transferMode;
    }

    public void setTransferMode(Integer transferMode) {
        this.transferMode = transferMode;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getTransferTypeUniqueIdentifier() {
        return this.transferTypeUniqueIdentifier;
    }

    public void setTransferTypeUniqueIdentifier(String transferTypeUniqueIdentifier) {
        this.transferTypeUniqueIdentifier = transferTypeUniqueIdentifier;
    }

    public String getFlowId() {
        return this.flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public TransferInfo getTransferInfo() {
        return this.transferInfo;
    }

    public void setTransferInfo(TransferInfo transferInfo) {
        this.transferInfo = transferInfo;
    }

    public String getTransferKey() {
        return this.transferKey;
    }

    public void setTransferKey(String transferKey) {
        this.transferKey = transferKey;
    }

    public String getInitiatorId() {
        return this.initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    public static class Builder {
        /**
         * 异动方式
         * <p> 示例值：2
         */
        private Integer transferMode;
        /**
         * 雇员id
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         */
        private String employmentId;
        /**
         * 异动类型唯一标识
         * <p> 示例值：internal_transfer
         */
        private String transferTypeUniqueIdentifier;
        /**
         * 异动流程ID
         * <p> 示例值：people_6963913041981490725_6983885526583627531
         */
        private String flowId;
        /**
         * 生效日期
         * <p> 示例值：2022-03-01
         */
        private String effectiveDate;
        /**
         * 异动详细信息
         * <p> 示例值：
         */
        private TransferInfo transferInfo;
        /**
         * 异动记录标识符
         * <p> 示例值：transfer_3627531
         */
        private String transferKey;
        /**
         * 异动发起人 ID
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         */
        private String initiatorId;

        /**
         * 异动方式
         * <p> 示例值：2
         *
         * @param transferMode
         * @return
         */
        public Builder transferMode(Integer transferMode) {
            this.transferMode = transferMode;
            return this;
        }

        /**
         * 雇员id
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 异动类型唯一标识
         * <p> 示例值：internal_transfer
         *
         * @param transferTypeUniqueIdentifier
         * @return
         */
        public Builder transferTypeUniqueIdentifier(String transferTypeUniqueIdentifier) {
            this.transferTypeUniqueIdentifier = transferTypeUniqueIdentifier;
            return this;
        }


        /**
         * 异动流程ID
         * <p> 示例值：people_6963913041981490725_6983885526583627531
         *
         * @param flowId
         * @return
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }


        /**
         * 生效日期
         * <p> 示例值：2022-03-01
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * 异动详细信息
         * <p> 示例值：
         *
         * @param transferInfo
         * @return
         */
        public Builder transferInfo(TransferInfo transferInfo) {
            this.transferInfo = transferInfo;
            return this;
        }


        /**
         * 异动记录标识符
         * <p> 示例值：transfer_3627531
         *
         * @param transferKey
         * @return
         */
        public Builder transferKey(String transferKey) {
            this.transferKey = transferKey;
            return this;
        }


        /**
         * 异动发起人 ID
         * <p> 示例值：ou_a294793e8fa21529f2a60e3e9de45520
         *
         * @param initiatorId
         * @return
         */
        public Builder initiatorId(String initiatorId) {
            this.initiatorId = initiatorId;
            return this;
        }


        public CreateJobChangeReqBody build() {
            return new CreateJobChangeReqBody(this);
        }
    }
}
