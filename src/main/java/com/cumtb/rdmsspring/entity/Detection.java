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
@TableName("detection")
@ApiModel(value="Detection对象", description="")
public class Detection implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("detectionId")
    private Integer detectionId;

    private String number;

    private String name;

    @TableField("startDescribe")
    private String startDescribe;

    @TableField("endDescribe")
    private String endDescribe;

    @TableField("startGrid")
    private String startGrid;

    @TableField("endGrid")
    private String endGrid;

    @TableField("groundId")
    private Integer groundId;

    @TableField("fieldAndDirection")
    private String fieldAndDirection;

    @TableField("projectId")
    private Integer projectId;


}
