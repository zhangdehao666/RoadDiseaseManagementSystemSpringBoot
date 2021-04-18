package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cxwzxx")
@ApiModel(value="Cxwzxx对象", description="")
public class Cxwzxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CXWZXXID")
    private String cxwzxxid;

    @TableField("XTCXBH")
    private String xtcxbh;

    @TableField("XCHCXMC")
    private String xchcxmc;

    @TableField("QDWZHMS")
    private String qdwzhms;

    @TableField("ZHDWZHMS")
    private String zhdwzhms;

    @TableField("QDWZHLCH")
    private Float qdwzhlch;

    @TableField("ZHDWZHLCH")
    private Float zhdwzhlch;

    @TableField("QDWZHGPSZB")
    private String qdwzhgpszb;

    @TableField("ZHDWZHGPSZB")
    private String zhdwzhgpszb;

    @TableField("CXSHX")
    private String cxshx;

    @TableField("CXLYJFX")
    private Integer cxlyjfx;

    @TableField("GDDSH")
    private Integer gddsh;

    @TableField("GDGPSZB")
    private String gdgpszb;

    @TableField("CHDXX")
    private String chdxx;

    @TableField("XMLXXXID")
    private String xmlxxxid;

    @TableField("QDDTZB")
    private String qddtzb;

    @TableField("ZHDDTZB")
    private String zhddtzb;

    @TableField("CXTCQK")
    private String cxtcqk;

    private String gpswjm;

    private String gpswjlj;

    @TableField("JTYL")
    private String jtyl;

    @TableField("TCQYID")
    private String tcqyid;

    private String cxjlshj;


}
