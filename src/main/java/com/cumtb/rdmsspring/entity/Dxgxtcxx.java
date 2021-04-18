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
@TableName("dxgxtcxx")
@ApiModel(value="Dxgxtcxx对象", description="")
public class Dxgxtcxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DXGXTCXXID")
    private String dxgxtcxxid;

    @ApiModelProperty(value = "管线编号")
    @TableField("GXBH")
    private String gxbh;

    @ApiModelProperty(value = "管线现场编号")
    @TableField("GXXCHBH")
    private String gxxchbh;

    @TableField("GXMSH")
    private String gxmsh;

    @TableField("GXLX")
    private String gxlx;

    @TableField("GXCHC")
    private String gxchc;

    @TableField("GXZHXWZH")
    private String gxzhxwzh;

    @TableField("GXTPWJ")
    private String gxtpwj;

    @TableField("GXTPWJLJ")
    private String gxtpwjlj;

    @TableField("GXZHPWJ")
    private String gxzhpwj;

    @TableField("GXZHPWJLJ")
    private String gxzhpwjlj;

    @TableField("GXSHYTWJ")
    private String gxshytwj;

    @TableField("GXSHYTLJ")
    private String gxshytlj;

    @TableField("DXQDDTZB")
    private String dxqddtzb;

    @TableField("GXQDZB")
    private String gxqdzb;

    @TableField("GXZHDDTZB")
    private String gxzhddtzb;

    @TableField("GXZHDZB")
    private String gxzhdzb;

    @TableField("GXQDMSH")
    private String gxqdmsh;

    @TableField("GXZHDMSH")
    private String gxzhdmsh;

    @TableField("GXQDLCH")
    private String gxqdlch;

    @TableField("GXZHDLCH")
    private String gxzhdlch;

    @ApiModelProperty(value = "管道百度坐标")
    @TableField("GDDTZB")
    private String gddtzb;

    @TableField("GDZB")
    private String gdzb;

    @TableField("GJ")
    private Float gj;

    @TableField("CAIZHI")
    private String caizhi;

    @TableField("QSHDGDBG")
    private String qshdgdbg;

    @TableField("QSHDGDMS")
    private String qshdgdms;

    @TableField("ZZHDGDBG")
    private String zzhdgdbg;

    @TableField("ZZHDGDMS")
    private String zzhdgdms;

    @TableField("PG")
    private Float pg;

    @TableField("QSHDW")
    private String qshdw;

    @TableField("MSHRQ")
    private String mshrq;

    @TableField("MSHFSH")
    private String mshfsh;

    @TableField("ISGXD")
    private String isgxd;

    @TableField("XZB")
    private String xzb;

    @TableField("YZB")
    private String yzb;

    @TableField("GXDGJLX")
    private String gxdgjlx;

    @TableField("CXWZXXID")
    private String cxwzxxid;

    @TableField("DXGXBZKID")
    private String dxgxbzkid;

    @TableField("GXQDDTZB")
    private String gxqddtzb;


}
