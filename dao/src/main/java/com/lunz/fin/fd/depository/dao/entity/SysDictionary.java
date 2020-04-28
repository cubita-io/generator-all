package com.lunz.fin.fd.depository.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author fin-cloud-group
 * @since 2020-04-28
 */
@TableName("sys_dictionary")
public class SysDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型
     */
    @TableField("Type")
    private String type;

    /**
     * 内容
     */
    @TableField("Content")
    private String content;

    /**
     * 编号
     */
    @TableField("Code")
    private Integer code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "SysDictionary{" +
            "id=" + id +
            ", type=" + type +
            ", content=" + content +
            ", code=" + code +
        "}";
    }
}
