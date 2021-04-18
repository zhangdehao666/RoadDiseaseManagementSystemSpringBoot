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
@TableName("controlp")
@ApiModel(value="Controlp对象", description="")
public class Controlp implements Serializable {

    private static final long serialVersionUID = 1L;

    private String pointid;

    @TableField("sourceP")
    private String sourceP;

    @TableField("targetP")
    private String targetP;

    @TableField("sourceGps")
    private String sourceGps;


}
