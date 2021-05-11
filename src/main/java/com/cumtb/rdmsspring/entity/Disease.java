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
@TableName("disease")
@ApiModel(value="Disease对象", description="")
public class Disease implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("diseaseId")
    private Integer diseaseId;

    private String field;

    @TableField("typeId")
    private Integer typeId;

    @TableField("gradeId")
    private Integer gradeId;

    private String size;

    private String position;

    private String tightness;

    private String porosity;

    private String moisture;

    private String features;

    private String atlas;

    @TableField("atlasPath")
    private String atlasPath;

    private String photo;

    @TableField("photoPath")
    private String photoPath;

    private String introduce;

    @TableField("detectionId")
    private Integer detectionId;


}
