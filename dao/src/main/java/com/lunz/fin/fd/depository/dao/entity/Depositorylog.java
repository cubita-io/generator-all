package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 档案履历
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("tb_depositorylog")
public class Depositorylog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Long id;

    /**
     * 业务Id
     */
    @TableField("BusinessId")
    private String businessId;

    /**
     * 存管状态
     */
    @TableField("Status")
    private Integer status;

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
     * 操作时间
     */
    @TableField("OperationDate")
    private LocalDateTime operationDate;

    /**
     * 操作
     */
    @TableField("Operation")
    private String operation;

    /**
     * 说明
     */
    @TableField("Remarks")
    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    public LocalDateTime getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Depositorylog{" +
            "id=" + id +
            ", businessId=" + businessId +
            ", status=" + status +
            ", operatorId=" + operatorId +
            ", operator=" + operator +
            ", operationDate=" + operationDate +
            ", operation=" + operation +
            ", remarks=" + remarks +
        "}";
    }
}
