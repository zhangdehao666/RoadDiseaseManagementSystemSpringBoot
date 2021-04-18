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
@TableName("bzbhxx")
@ApiModel(value="Bzbhxx对象", description="")
public class Bzbhxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BZBHXXID")
    private String bzbhxxid;

    @TableField("MXBHBH")
    private String mxbhbh;

    @TableField("MXDD")
    private String mxdd;

    @TableField("TCDW")
    private String tcdw;

    @TableField("TCDWDM")
    private String tcdwdm;

    @TableField("BHYSHSHJWJM")
    private String bhyshshjwjm;

    @TableField("BHCHLSHJWJM")
    private String bhchlshjwjm;

    @TableField("MXBHTPWJM")
    private String mxbhtpwjm;

    @TableField("MXBHTPLJ")
    private String mxbhtplj;

    @TableField("MXBHLJ")
    private String mxbhlj;

    @TableField("MXTXZP")
    private Float mxtxzp;

    @TableField("MXDJG")
    private Float mxdjg;

    @TableField("MXDSH")
    private Integer mxdsh;

    @TableField("MXBHLY")
    private String mxbhly;

    @TableField("MXBHLX")
    private String mxbhlx;

    @TableField("MXBHDJ")
    private String mxbhdj;

    @TableField("MXBHCXCHC")
    private String mxbhcxchc;

    @TableField("MXBHDTZB")
    private String mxbhdtzb;

    @TableField("MXBHZHXWZH")
    private String mxbhzhxwzh;

    @TableField("MXBHPJJSHD")
    private Float mxbhpjjshd;

    @TableField("MXBHPJKXL")
    private Float mxbhpjkxl;

    @TableField("MXBHPJHSHL")
    private Float mxbhpjhshl;

    @TableField("MXBHTZCSH1")
    private Float mxbhtzcsh1;

    @TableField("MXBHTZCSH2")
    private Float mxbhtzcsh2;

    @TableField("MXBHTZCSH3")
    private Float mxbhtzcsh3;

    @TableField("MXBHTZCSH4")
    private Float mxbhtzcsh4;

    private String companyid;


}
