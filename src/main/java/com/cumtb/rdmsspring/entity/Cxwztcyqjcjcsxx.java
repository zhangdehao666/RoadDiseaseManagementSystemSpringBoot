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
@TableName("cxwztcyqjcjcsxx")
@ApiModel(value="Cxwztcyqjcjcsxx对象", description="")
public class Cxwztcyqjcjcsxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CXWZTCYQJCJCSXXID")
    private String cxwztcyqjcjcsxxid;

    @ApiModelProperty(value = "惟一标识仪器参数")
    @TableField("YQCSBH")
    private String yqcsbh;

    @ApiModelProperty(value = "天线编号")
    @TableField("TXBH")
    private String txbh;

    @TableField("TXPL")
    private Float txpl;

    @TableField("ZJXH")
    private String zjxh;

    @TableField("SHJCH")
    private Float shjch;

    @TableField("CYDSH")
    private Integer cydsh;

    @TableField("ZHDSH")
    private Integer zhdsh;

    @TableField("CHFFSH")
    private String chffsh;

    @TableField("CJLKZHDJJ")
    private Float cjlkzhdjj;

    @TableField("GPSCJDJG")
    private Integer gpscjdjg;

    @TableField("SHPTXDJG")
    private Integer shptxdjg;

    @TableField("DJJ")
    private Float djj;

    @TableField("CXWZXXID")
    private String cxwzxxid;


}
