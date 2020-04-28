package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 出库订单信息
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_outorderinfo")
public class Outorderinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键(OO)
     */
    @TableId("Id")
    private String id;

    /**
     * 出库订单编码
     */
    @TableField("OutOrderNumber")
    private String outOrderNumber;

    /**
     * 出库订单类型
     */
    @TableField("OutOrderType")
    private Integer outOrderType;

    /**
     * 出库订单来源
     */
    @TableField("Source")
    private String source;

    /**
     * 客户名称
     */
    @TableField("CustomerName")
    private String customerName;

    /**
     * 出库状态
     */
    @TableField("Status")
    private Integer status;

    /**
     * 备注
     */
    @TableField("Remarks")
    private String remarks;

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
    @TableField("JsonString1")
    private String jsonString1;

    /**
     * json
     */
    @TableField("JsonString2")
    private String jsonString2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getOutOrderNumber() {
        return outOrderNumber;
    }

    public void setOutOrderNumber(String outOrderNumber) {
        this.outOrderNumber = outOrderNumber;
    }
    public Integer getOutOrderType() {
        return outOrderType;
    }

    public void setOutOrderType(Integer outOrderType) {
        this.outOrderType = outOrderType;
    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
    public String getJsonString1() {
        return jsonString1;
    }

    public void setJsonString1(String jsonString1) {
        this.jsonString1 = jsonString1;
    }
    public String getJsonString2() {
        return jsonString2;
    }

    public void setJsonString2(String jsonString2) {
        this.jsonString2 = jsonString2;
    }

    @Override
    public String toString() {
        return "Outorderinfo{" +
            "id=" + id +
            ", outOrderNumber=" + outOrderNumber +
            ", outOrderType=" + outOrderType +
            ", source=" + source +
            ", customerName=" + customerName +
            ", status=" + status +
            ", remarks=" + remarks +
            ", createdById=" + createdById +
            ", createdAt=" + createdAt +
            ", updatedById=" + updatedById +
            ", updatedAt=" + updatedAt +
            ", deletedById=" + deletedById +
            ", deletedAt=" + deletedAt +
            ", deleted=" + deleted +
            ", jsonString1=" + jsonString1 +
            ", jsonString2=" + jsonString2 +
        "}";
    }
}
