package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 任务号生成表
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("sys_tasknum")
public class SysTasknum implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序列前缀,两位字符
     */
    @TableId("Seq_no")
    private String seqNo;

    /**
     * 对应DB名
     */
    @TableField("DBName")
    private String dBName;

    /**
     * 表名
     */
    @TableField("TableName")
    private String tableName;

    /**
     * 字段名
     */
    @TableField("FieldName")
    private String fieldName;

    /**
     * 序列当前值
     */
    @TableField("Current_value")
    private Long currentValue;

    /**
     * 步长
     */
    @TableField("Increment")
    private Integer increment;

    /**
     * 说明
     */
    @TableField("Content")
    private String content;

    /**
     * 记录日期
     */
    @TableField("RecordDate")
    private String recordDate;

    /**
     * 更新时间
     */
    @TableField("UpdateAt")
    private LocalDateTime updateAt;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }
    public String getdBName() {
        return dBName;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public Long getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
    }
    public Integer getIncrement() {
        return increment;
    }

    public void setIncrement(Integer increment) {
        this.increment = increment;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "SysTasknum{" +
            "seqNo=" + seqNo +
            ", dBName=" + dBName +
            ", tableName=" + tableName +
            ", fieldName=" + fieldName +
            ", currentValue=" + currentValue +
            ", increment=" + increment +
            ", content=" + content +
            ", recordDate=" + recordDate +
            ", updateAt=" + updateAt +
        "}";
    }
}
