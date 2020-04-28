package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 入库导入模板
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_import_instock")
public class ImportInstock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 导入批号
     */
    @TableField("BatchNo")
    private String batchNo;

    /**
     * 入库任务号
     */
    @TableField("InStockId")
    private String inStockId;

    /**
     * 条形码
     */
    @TableField("BarCode")
    private String barCode;

    /**
     * 库位编码
     */
    @TableField("LocationCode")
    private String locationCode;

    /**
     * 箱号
     */
    @TableField("CartonNo")
    private String cartonNo;

    /**
     * 入库日期
     */
    @TableField("InStockDate")
    private LocalDate inStockDate;

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
    public String getInStockId() {
        return inStockId;
    }

    public void setInStockId(String inStockId) {
        this.inStockId = inStockId;
    }
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    public String getCartonNo() {
        return cartonNo;
    }

    public void setCartonNo(String cartonNo) {
        this.cartonNo = cartonNo;
    }
    public LocalDate getInStockDate() {
        return inStockDate;
    }

    public void setInStockDate(LocalDate inStockDate) {
        this.inStockDate = inStockDate;
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
        return "ImportInstock{" +
            "batchNo=" + batchNo +
            ", inStockId=" + inStockId +
            ", barCode=" + barCode +
            ", locationCode=" + locationCode +
            ", cartonNo=" + cartonNo +
            ", inStockDate=" + inStockDate +
            ", failReason=" + failReason +
            ", createdById=" + createdById +
            ", createdAt=" + createdAt +
            ", jsonString=" + jsonString +
        "}";
    }
}
