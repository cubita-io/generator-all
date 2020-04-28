package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 收货任务表
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_receivingtask")
public class Receivingtask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收货任务号(IN)
     */
    @TableId("Id")
    private String id;

    /**
     * 收货订单Id
     */
    @TableField("InorderId")
    private String inorderId;

    /**
     * 工作流Id
     */
    @TableField("WorkFlowId")
    private String workFlowId;

    /**
     * 收货状态
     */
    @TableField("Status")
    private Integer status;

    /**
     * 收件方式
     */
    @TableField("ReceivingMethod")
    private Integer receivingMethod;

    /**
     * 收货仓库编码
     */
    @TableField("WarehouseCode")
    private String warehouseCode;

    /**
     * 收货仓库名称
     */
    @TableField("Warehouse")
    private String warehouse;

    /**
     * 任务日期
     */
    @TableField("ReceivingDate")
    private LocalDate receivingDate;

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
    public String getInorderId() {
        return inorderId;
    }

    public void setInorderId(String inorderId) {
        this.inorderId = inorderId;
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
    public Integer getReceivingMethod() {
        return receivingMethod;
    }

    public void setReceivingMethod(Integer receivingMethod) {
        this.receivingMethod = receivingMethod;
    }
    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    public LocalDate getReceivingDate() {
        return receivingDate;
    }

    public void setReceivingDate(LocalDate receivingDate) {
        this.receivingDate = receivingDate;
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
        return "Receivingtask{" +
            "id=" + id +
            ", inorderId=" + inorderId +
            ", workFlowId=" + workFlowId +
            ", status=" + status +
            ", receivingMethod=" + receivingMethod +
            ", warehouseCode=" + warehouseCode +
            ", warehouse=" + warehouse +
            ", receivingDate=" + receivingDate +
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
