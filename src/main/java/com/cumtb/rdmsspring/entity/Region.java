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
 * @since 2021-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("region")
@ApiModel(value="Region对象", description="")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("regionId")
    private Integer regionId;

    private String province;

    private String city;

    private String area;

    private String street;

    private String position;

    @TableField("projectId")
    private Integer projectId;


}
