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
@TableName("bhxhfaxx")
@ApiModel(value="Bhxhfaxx对象", description="")
public class Bhxhfaxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("BHXHFAXXID")
    private String bhxhfaxxid;

    @TableField("XFDW")
    private String xfdw;

    @TableField("XFFZR")
    private String xffzr;

    @TableField("XFFABH")
    private Integer xffabh;

    @TableField("XFSHJ")
    private String xfshj;

    @TableField("XFFANLJ")
    private String xffanlj;

    @TableField("XFFAN")
    private String xffan;

    @TableField("CXWZXXID")
    private String cxwzxxid;


}
