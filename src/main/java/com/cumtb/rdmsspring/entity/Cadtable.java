package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("cadtable")
@ApiModel(value="Cadtable对象", description="")
public class Cadtable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cadid;

    @TableField("DXGXTCXXID")
    private String dxgxtcxxid;

    @TableField("GXQDZB")
    private String gxqdzb;

    @TableField("GXZHDZB")
    private String gxzhdzb;

    @TableField("GDZB")
    private String gdzb;

    @TableField("GXSHYTWJ")
    private String gxshytwj;


}
