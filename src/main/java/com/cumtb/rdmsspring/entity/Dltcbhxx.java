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
@TableName("dltcbhxx")
@ApiModel(value="Dltcbhxx对象", description="")
public class Dltcbhxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DLTCBHXXID")
    private String dltcbhxxid;

    @TableField("BHLY")
    private String bhly;

    @TableField("BHLX")
    private String bhlx;

    @TableField("BHDJ")
    private String bhdj;

    @TableField("BHCXCHC")
    private String bhcxchc;

    @TableField("BHDTZB")
    private String bhdtzb;

    @TableField("BHZHXWZH")
    private String bhzhxwzh;

    @TableField("BHPJJSHD")
    private Float bhpjjshd;

    @TableField("BHPJKXL")
    private Float bhpjkxl;

    @TableField("BHPJHSHL")
    private Float bhpjhshl;

    @TableField("BHTZCSH1")
    private Float bhtzcsh1;

    @TableField("BHTZCSH2")
    private Float bhtzcsh2;

    @TableField("BHTZCSH3")
    private Float bhtzcsh3;

    @TableField("BHTZCSH4")
    private Float bhtzcsh4;

    @TableField("LDBHTPWJM")
    private String ldbhtpwjm;

    @TableField("XCHBHZHPWJM")
    private String xchbhzhpwjm;

    @TableField("BHZHPLJ")
    private String bhzhplj;

    @TableField("BHTPLJ")
    private String bhtplj;

    @TableField("BHYZMSH")
    private String bhyzmsh;

    @TableField("CXWZXXID")
    private String cxwzxxid;

    @TableField("BZBHXXID")
    private String bzbhxxid;

    private String bhxhfaxxid;

    private String cxtcldsjccxxid;


}
