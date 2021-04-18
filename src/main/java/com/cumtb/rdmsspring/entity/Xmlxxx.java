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
@TableName("xmlxxx")
@ApiModel(value="Xmlxxx对象", description="")
public class Xmlxxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("XMLXXXID")
    private String xmlxxxid;

    @TableField("XMBH")
    private String xmbh;

    @TableField("XMMC")
    private String xmmc;

    @TableField("TCDWDM")
    private String tcdwdm;

    @TableField("TCDW")
    private String tcdw;

    @TableField("WTDW")
    private String wtdw;

    @TableField("FZR")
    private String fzr;

    @TableField("CYRY")
    private String cyry;

    @TableField("JLRY")
    private String jlry;

    @TableField("XMSHQLJ")
    private String xmshqlj;

    @ApiModelProperty(value = "项目申请")
    @TableField("XMSHQ")
    private String xmshq;

    @ApiModelProperty(value = "项目批复")
    @TableField("XMPF")
    private String xmpf;

    @ApiModelProperty(value = "项目合同")
    @TableField("XMHT")
    private String xmht;

    @ApiModelProperty(value = "项目图鉴")
    @TableField("XMTJ")
    private String xmtj;

    @TableField("XMJGSH")
    private String xmjgsh;

    @TableField("ORGID")
    private Integer orgid;

    private String companyid;

    @TableField("XMPFLJ")
    private String xmpflj;

    @TableField("XMHTLJ")
    private String xmhtlj;

    @TableField("ENDTIME")
    private String endtime;

    @TableField("STARTTIME")
    private String starttime;

    @TableField("XMTJLJ")
    private String xmtjlj;

    @TableField("XMWJLJ")
    private String xmwjlj;


}
