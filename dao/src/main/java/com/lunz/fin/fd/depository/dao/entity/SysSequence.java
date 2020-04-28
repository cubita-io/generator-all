package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 自定义主键规则表
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("sys_sequence")
public class SysSequence implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序列前缀,两位字符
     */
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
    private Long currentValue;

    /**
     * 步长
     */
    private Integer increment;

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

    @Override
    public String toString() {
        return "SysSequence{" +
            "seqNo=" + seqNo +
            ", dBName=" + dBName +
            ", tableName=" + tableName +
            ", fieldName=" + fieldName +
            ", currentValue=" + currentValue +
            ", increment=" + increment +
        "}";
    }
}
