package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 存管类型表
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("sys_typecode")
public class SysTypecode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    @TableField("Name")
    private String name;

    /**
     * 编码
     */
    @TableField("Code")
    private String code;

    /**
     * 是否删除(0否1是)
     */
    @TableField("Deleted")
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "SysTypecode{" +
            "id=" + id +
            ", name=" + name +
            ", code=" + code +
            ", deleted=" + deleted +
        "}";
    }
}
