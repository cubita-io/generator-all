package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 收货物流信息
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_receivingpost")
public class Receivingpost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键(RP)
     */
    @TableId("Id")
    private String id;

    /**
     * 收货任务Id
     */
    @TableField("ReceivingId")
    private String receivingId;

    /**
     * 快递公司
     */
    @TableField("PostCompany")
    private Integer postCompany;

    /**
     * 物流单号
     */
    @TableField("PostNumber")
    private String postNumber;

    /**
     * 收货结果
     */
    @TableField("ReceivingResult")
    private Integer receivingResult;

    /**
     * 收货人Id
     */
    @TableField("ReceiverId")
    private String receiverId;

    /**
     * 收货人
     */
    @TableField("Receiver")
    private String receiver;

    /**
     * 收货时间
     */
    @TableField("ReceivingDate")
    private LocalDate receivingDate;

    /**
     * 备注
     */
    @TableField("Remarks")
    private String remarks;

    /**
     * 拒收原因
     */
    @TableField("RejectionReason")
    private String rejectionReason;

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
    public String getReceivingId() {
        return receivingId;
    }

    public void setReceivingId(String receivingId) {
        this.receivingId = receivingId;
    }
    public Integer getPostCompany() {
        return postCompany;
    }

    public void setPostCompany(Integer postCompany) {
        this.postCompany = postCompany;
    }
    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }
    public Integer getReceivingResult() {
        return receivingResult;
    }

    public void setReceivingResult(Integer receivingResult) {
        this.receivingResult = receivingResult;
    }
    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public LocalDate getReceivingDate() {
        return receivingDate;
    }

    public void setReceivingDate(LocalDate receivingDate) {
        this.receivingDate = receivingDate;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
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
        return "Receivingpost{" +
            "id=" + id +
            ", receivingId=" + receivingId +
            ", postCompany=" + postCompany +
            ", postNumber=" + postNumber +
            ", receivingResult=" + receivingResult +
            ", receiverId=" + receiverId +
            ", receiver=" + receiver +
            ", receivingDate=" + receivingDate +
            ", remarks=" + remarks +
            ", rejectionReason=" + rejectionReason +
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
