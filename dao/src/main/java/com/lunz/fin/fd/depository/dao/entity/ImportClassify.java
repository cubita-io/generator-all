package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 清分导入模板
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_import_classify")
public class ImportClassify implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 导入批号
     */
    @TableField("BatchNo")
    private String batchNo;

    /**
     * 清分结果
     */
    @TableField("ClassifyResults")
    private String classifyResults;

    /**
     * 存管号
     */
    @TableField("DepositNo")
    private String depositNo;

    /**
     * 条形码
     */
    @TableField("BarCode")
    private String barCode;

    /**
     * 附件
     */
    @TableField("Url")
    private String url;

    /**
     * 失败原因
     */
    @TableField("FailReason")
    private String failReason;

    /**
     * 创建人
     */
    @TableField("CreatedById")
    private String createdById;

    /**
     * 创建时间
     */
    @TableField("CreatedAt")
    private LocalDateTime createdAt;

    /**
     * json
     */
    @TableField("JsonString")
    private String jsonString;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
    public String getClassifyResults() {
        return classifyResults;
    }

    public void setClassifyResults(String classifyResults) {
        this.classifyResults = classifyResults;
    }
    public String getDepositNo() {
        return depositNo;
    }

    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo;
    }
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    @Override
    public String toString() {
        return "ImportClassify{" +
            "batchNo=" + batchNo +
            ", classifyResults=" + classifyResults +
            ", depositNo=" + depositNo +
            ", barCode=" + barCode +
            ", url=" + url +
            ", failReason=" + failReason +
            ", createdById=" + createdById +
            ", createdAt=" + createdAt +
            ", jsonString=" + jsonString +
        "}";
    }
}
