package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 清分信息
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_classifyinfo")
public class Classifyinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 清分任务号(QF)
     */
    @TableId("Id")
    private String id;

    /**
     * 工作流Id
     */
    @TableField("WorkFlowId")
    private String workFlowId;

    /**
     * 清分状态
     */
    @TableField("Status")
    private Integer status;

    /**
     * 客户名称
     */
    @TableField("CustomerName")
    private String customerName;

    /**
     * 来源
     */
    @TableField("Source")
    private String source;

    /**
     * 清分任务生成日期
     */
    @TableField("ClassifyDate")
    private LocalDate classifyDate;

    /**
     * 清分结果说明
     */
    @TableField("ClassifyRemarks")
    private String classifyRemarks;

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
     * 更新人
     */
    @TableField("UpdatedById")
    private String updatedById;

    /**
     * 更新时间
     */
    @TableField("UpdatedAt")
    private LocalDateTime updatedAt;

    /**
     * 删除人
     */
    @TableField("DeletedById")
    private String deletedById;

    /**
     * 删除时间
     */
    @TableField("DeletedAt")
    private LocalDateTime deletedAt;

    /**
     * 是否删除：0否1是
     */
    @TableField("Deleted")
    private Boolean deleted;

    /**
     * json
     */
    @TableField("JsonString")
    private String jsonString;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getWorkFlowId() {
        return workFlowId;
    }

    public void setWorkFlowId(String workFlowId) {
        this.workFlowId = workFlowId;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    public LocalDate getClassifyDate() {
        return classifyDate;
    }

    public void setClassifyDate(LocalDate classifyDate) {
        this.classifyDate = classifyDate;
    }
    public String getClassifyRemarks() {
        return classifyRemarks;
    }

    public void setClassifyRemarks(String classifyRemarks) {
        this.classifyRemarks = classifyRemarks;
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
    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public String getDeletedById() {
        return deletedById;
    }

    public void setDeletedById(String deletedById) {
        this.deletedById = deletedById;
    }
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    @Override
    public String toString() {
        return "Classifyinfo{" +
            "id=" + id +
            ", workFlowId=" + workFlowId +
            ", status=" + status +
            ", customerName=" + customerName +
            ", source=" + source +
            ", classifyDate=" + classifyDate +
            ", classifyRemarks=" + classifyRemarks +
            ", createdById=" + createdById +
            ", createdAt=" + createdAt +
            ", updatedById=" + updatedById +
            ", updatedAt=" + updatedAt +
            ", deletedById=" + deletedById +
            ", deletedAt=" + deletedAt +
            ", deleted=" + deleted +
            ", jsonString=" + jsonString +
        "}";
    }
}
