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
@TableName("xmbg")
@ApiModel(value="Xmbg对象", description="")
public class Xmbg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("XMBGID")
    private String xmbgid;

    @TableField("XMBGMC")
    private String xmbgmc;

    @TableField("XMBGLJ")
    private String xmbglj;

    @TableField("XMLXXXID")
    private String xmlxxxid;


}
