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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class ExportTask {
    /**
     * 导出文件扩展名
     * <p> 示例值：pdf
     */
    @SerializedName("file_extension")
    private String fileExtension;
    /**
     * 导出文档 token [获取文档 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
     * <p> 示例值：doccnxe5OxxxxxxxSNdsJviENsk
     */
    @SerializedName("token")
    private String token;
    /**
     * 导出文档类型 [文档类型说明](/ssl::ttdoc/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#560bf735)
     * <p> 示例值：doc
     */
    @SerializedName("type")
    private String type;
    /**
     * 导出文件名
     * <p> 示例值：docName
     */
    @SerializedName("file_name")
    private String fileName;
    /**
     * 导出子表ID，仅当将电子表格/多维表格导出为 csv 时使用;;;[获取电子表格子表ID](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query) 文档中的 sheet_id;;[获取多维表格子表ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table/list) 文档中的 table_id
     * <p> 示例值：tblKz5D60T4JlfcT
     */
    @SerializedName("sub_id")
    private String subId;
    /**
     * 导出文件 drive token
     * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
     */
    @SerializedName("file_token")
    private String fileToken;
    /**
     * 导出文件大小，单位字节
     * <p> 示例值：34356
     */
    @SerializedName("file_size")
    private Integer fileSize;
    /**
     * 任务失败原因
     * <p> 示例值：success
     */
    @SerializedName("job_error_msg")
    private String jobErrorMsg;
    /**
     * 任务状态
     * <p> 示例值：0
     */
    @SerializedName("job_status")
    private Integer jobStatus;

    // builder 开始
    public ExportTask() {
    }

    public ExportTask(Builder builder) {
        /**
         * 导出文件扩展名
         * <p> 示例值：pdf
         */
        this.fileExtension = builder.fileExtension;
        /**
         * 导出文档 token [获取文档 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
         * <p> 示例值：doccnxe5OxxxxxxxSNdsJviENsk
         */
        this.token = builder.token;
        /**
         * 导出文档类型 [文档类型说明](/ssl::ttdoc/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#560bf735)
         * <p> 示例值：doc
         */
        this.type = builder.type;
        /**
         * 导出文件名
         * <p> 示例值：docName
         */
        this.fileName = builder.fileName;
        /**
         * 导出子表ID，仅当将电子表格/多维表格导出为 csv 时使用;;;[获取电子表格子表ID](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query) 文档中的 sheet_id;;[获取多维表格子表ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table/list) 文档中的 table_id
         * <p> 示例值：tblKz5D60T4JlfcT
         */
        this.subId = builder.subId;
        /**
         * 导出文件 drive token
         * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
         */
        this.fileToken = builder.fileToken;
        /**
         * 导出文件大小，单位字节
         * <p> 示例值：34356
         */
        this.fileSize = builder.fileSize;
        /**
         * 任务失败原因
         * <p> 示例值：success
         */
        this.jobErrorMsg = builder.jobErrorMsg;
        /**
         * 任务状态
         * <p> 示例值：0
         */
        this.jobStatus = builder.jobStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFileExtension() {
        return this.fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSubId() {
        return this.subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getFileToken() {
        return this.fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public Integer getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getJobErrorMsg() {
        return this.jobErrorMsg;
    }

    public void setJobErrorMsg(String jobErrorMsg) {
        this.jobErrorMsg = jobErrorMsg;
    }

    public Integer getJobStatus() {
        return this.jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public static class Builder {
        /**
         * 导出文件扩展名
         * <p> 示例值：pdf
         */
        private String fileExtension;
        /**
         * 导出文档 token [获取文档 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
         * <p> 示例值：doccnxe5OxxxxxxxSNdsJviENsk
         */
        private String token;
        /**
         * 导出文档类型 [文档类型说明](/ssl::ttdoc/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#560bf735)
         * <p> 示例值：doc
         */
        private String type;
        /**
         * 导出文件名
         * <p> 示例值：docName
         */
        private String fileName;
        /**
         * 导出子表ID，仅当将电子表格/多维表格导出为 csv 时使用;;;[获取电子表格子表ID](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query) 文档中的 sheet_id;;[获取多维表格子表ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table/list) 文档中的 table_id
         * <p> 示例值：tblKz5D60T4JlfcT
         */
        private String subId;
        /**
         * 导出文件 drive token
         * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
         */
        private String fileToken;
        /**
         * 导出文件大小，单位字节
         * <p> 示例值：34356
         */
        private Integer fileSize;
        /**
         * 任务失败原因
         * <p> 示例值：success
         */
        private String jobErrorMsg;
        /**
         * 任务状态
         * <p> 示例值：0
         */
        private Integer jobStatus;

        /**
         * 导出文件扩展名
         * <p> 示例值：pdf
         *
         * @param fileExtension
         * @return
         */
        public Builder fileExtension(String fileExtension) {
            this.fileExtension = fileExtension;
            return this;
        }

        /**
         * 导出文件扩展名
         * <p> 示例值：pdf
         *
         * @param fileExtension {@link com.lark.oapi.service.drive.v1.enums.ExportTaskFileExtensionEnum}
         * @return
         */
        public Builder fileExtension(com.lark.oapi.service.drive.v1.enums.ExportTaskFileExtensionEnum fileExtension) {
            this.fileExtension = fileExtension.getValue();
            return this;
        }


        /**
         * 导出文档 token [获取文档 token](https://open.feishu.cn/document/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#08bb5df6)
         * <p> 示例值：doccnxe5OxxxxxxxSNdsJviENsk
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }


        /**
         * 导出文档类型 [文档类型说明](/ssl::ttdoc/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#560bf735)
         * <p> 示例值：doc
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 导出文档类型 [文档类型说明](/ssl::ttdoc/ukTMukTMukTM/uczNzUjL3czM14yN3MTN#560bf735)
         * <p> 示例值：doc
         *
         * @param type {@link com.lark.oapi.service.drive.v1.enums.ExportTaskTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.drive.v1.enums.ExportTaskTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 导出文件名
         * <p> 示例值：docName
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }


        /**
         * 导出子表ID，仅当将电子表格/多维表格导出为 csv 时使用;;;[获取电子表格子表ID](https://open.feishu.cn/document/ukTMukTMukTM/uUDN04SN0QjL1QDN/sheets-v3/spreadsheet-sheet/query) 文档中的 sheet_id;;[获取多维表格子表ID](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/bitable-v1/app-table/list) 文档中的 table_id
         * <p> 示例值：tblKz5D60T4JlfcT
         *
         * @param subId
         * @return
         */
        public Builder subId(String subId) {
            this.subId = subId;
            return this;
        }


        /**
         * 导出文件 drive token
         * <p> 示例值：boxcnxe5OxxxxxxxSNdsJviENsk
         *
         * @param fileToken
         * @return
         */
        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }


        /**
         * 导出文件大小，单位字节
         * <p> 示例值：34356
         *
         * @param fileSize
         * @return
         */
        public Builder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }


        /**
         * 任务失败原因
         * <p> 示例值：success
         *
         * @param jobErrorMsg
         * @return
         */
        public Builder jobErrorMsg(String jobErrorMsg) {
            this.jobErrorMsg = jobErrorMsg;
            return this;
        }


        /**
         * 任务状态
         * <p> 示例值：0
         *
         * @param jobStatus
         * @return
         */
        public Builder jobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * 任务状态
         * <p> 示例值：0
         *
         * @param jobStatus {@link com.lark.oapi.service.drive.v1.enums.ExportTaskJobStatusEnum}
         * @return
         */
        public Builder jobStatus(com.lark.oapi.service.drive.v1.enums.ExportTaskJobStatusEnum jobStatus) {
            this.jobStatus = jobStatus.getValue();
            return this;
        }


        public ExportTask build() {
            return new ExportTask(this);
        }
    }
}
