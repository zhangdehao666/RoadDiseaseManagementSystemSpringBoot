package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@TableName("function")
@ApiModel(value="Function对象", description="")
public class Function implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "functionId", type = IdType.AUTO)
    private Integer functionId;

    @TableField("functionName")
    private String functionName;

    @TableField("funParentId")
    private Integer funParentId;

    @TableField("functionTime")
    private LocalDate functionTime;

    @TableField("functionPath")
    private String functionPath;


}
