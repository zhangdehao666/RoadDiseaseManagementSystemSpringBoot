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
@TableName("cxtcldsjccxx")
@ApiModel(value="Cxtcldsjccxx对象", description="")
public class Cxtcldsjccxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CXTCLDSJCCXXID")
    private String cxtcldsjccxxid;

    @TableField("YSHSHJWJM")
    private String yshshjwjm;

    @TableField("YSHSHJWJLJ")
    private String yshshjwjlj;

    @TableField("CHLSHJWJM")
    private String chlshjwjm;

    @TableField("CHLSHJWJLJ")
    private String chlshjwjlj;

    @TableField("GPSWJLJ")
    private String gpswjlj;

    @TableField("GPSWJM")
    private String gpswjm;

    @TableField("SHPTXWJLJ")
    private String shptxwjlj;

    @TableField("SHJSWJM")
    private String shjswjm;

    @TableField("CXWZXXID")
    private String cxwzxxid;

    @TableField("CXWZTCYQJCJCSXXID")
    private String cxwztcyqjcjcsxxid;

    private String shjbh;

    private String addtime;

    @TableField("tdrFilePath")
    private String tdrFilePath;

    @TableField("tdrFileName")
    private String tdrFileName;

    @TableField("zhzyFilePath")
    private String zhzyFilePath;

    @TableField("zhzyFileName")
    private String zhzyFileName;


}
