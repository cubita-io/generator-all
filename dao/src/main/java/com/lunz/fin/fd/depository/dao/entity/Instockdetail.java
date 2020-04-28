package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 入库详情
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_instockdetail")
public class Instockdetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键(ID)
     */
    @TableId("Id")
    private String id;

    /**
     * 入库任务Id
     */
    @TableField("InStockId")
    private String inStockId;

    /**
     * 存管号
     */
    @TableField("DepositNo")
    private String depositNo;

    /**
     * 存管类型
     */
    @TableField("DepositType")
    private String depositType;

    /**
     * 物品种类
     */
    @TableField("ItemType")
    private String itemType;

    /**
     * 条形码
     */
    @TableField("BarCode")
    private String barCode;

    /**
     * 箱号
     */
    @TableField("CartonNo")
    private String cartonNo;

    /**
     * 库位编码
     */
    @TableField("LocationCode")
    private String locationCode;

    /**
     * 库位名称
     */
    @TableField("LocationName")
    private String locationName;

    /**
     * 入库时间
     */
    @TableField("InStockDate")
    private LocalDate inStockDate;

    /**
     * 操作人Id
     */
    @TableField("OperatorId")
    private String operatorId;

    /**
     * 操作人
     */
    @TableField("Operator")
    private String operator;

    /**
     * 档案存放位置
     */
    @TableField("StorageAddress")
    private String storageAddress;

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
    public String getInStockId() {
        return inStockId;
    }

    public void setInStockId(String inStockId) {
        this.inStockId = inStockId;
    }
    public String getDepositNo() {
        return depositNo;
    }

    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo;
    }
    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    public String getCartonNo() {
        return cartonNo;
    }

    public void setCartonNo(String cartonNo) {
        this.cartonNo = cartonNo;
    }
    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
    public LocalDate getInStockDate() {
        return inStockDate;
    }

    public void setInStockDate(LocalDate inStockDate) {
        this.inStockDate = inStockDate;
    }
    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    public String getStorageAddress() {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress) {
        this.storageAddress = storageAddress;
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
        return "Instockdetail{" +
            "id=" + id +
            ", inStockId=" + inStockId +
            ", depositNo=" + depositNo +
            ", depositType=" + depositType +
            ", itemType=" + itemType +
            ", barCode=" + barCode +
            ", cartonNo=" + cartonNo +
            ", locationCode=" + locationCode +
            ", locationName=" + locationName +
            ", inStockDate=" + inStockDate +
            ", operatorId=" + operatorId +
            ", operator=" + operator +
            ", storageAddress=" + storageAddress +
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
