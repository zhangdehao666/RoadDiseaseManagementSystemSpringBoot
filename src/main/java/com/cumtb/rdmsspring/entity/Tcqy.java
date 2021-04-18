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
@TableName("tcqy")
@ApiModel(value="Tcqy对象", description="")
public class Tcqy implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("TCQYID")
    private String tcqyid;

    @ApiModelProperty(value = "市")
    @TableField("SHI")
    private String shi;

    @TableField("SHSH")
    private String shsh;

    @TableField("XXZ")
    private String xxz;

    @TableField("JD")
    private String jd;

    @TableField("TCQY")
    private String tcqy;

    @TableField("XMLXXXID")
    private String xmlxxxid;


}
