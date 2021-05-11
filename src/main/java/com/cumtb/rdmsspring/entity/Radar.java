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
@TableName("radar")
@ApiModel(value="Radar对象", description="")
public class Radar implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("radarId")
    private Integer radarId;

    private String number;

    @TableField("originalFile")
    private String originalFile;

    @TableField("originalPath")
    private String originalPath;

    @TableField("handleFile")
    private String handleFile;

    @TableField("handlePath")
    private String handlePath;

    @TableField("gridFile")
    private String gridFile;

    @TableField("gridPath")
    private String gridPath;

    @TableField("searchFile")
    private String searchFile;

    @TableField("searchPath")
    private String searchPath;

    @TableField("detectionId")
    private Integer detectionId;


}
