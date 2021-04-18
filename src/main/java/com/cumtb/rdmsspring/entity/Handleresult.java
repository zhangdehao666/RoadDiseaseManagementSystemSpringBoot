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
@TableName("handleresult")
@ApiModel(value="Handleresult对象", description="")
public class Handleresult implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("HANDLERESULTID")
    private String handleresultid;

    @TableField("CXTCLDSJCCXXID")
    private String cxtcldsjccxxid;

    @TableField("RYBH")
    private String rybh;

    @ApiModelProperty(value = "步骤次序")
    @TableField("PROORDER")
    private Integer proorder;

    @ApiModelProperty(value = "是否处理最后一步")
    @TableField("ISEND")
    private Integer isend;

    @ApiModelProperty(value = "步骤名称")
    @TableField("PROCESSNAME")
    private Integer processname;

    @ApiModelProperty(value = "处理结果文件名")
    @TableField("RESULTFILENAME")
    private String resultfilename;

    @ApiModelProperty(value = "处理结果路径")
    @TableField("RESULTFILEPATH")
    private String resultfilepath;

    @ApiModelProperty(value = "处理日期")
    @TableField("PROCESSDATE")
    private String processdate;

    @ApiModelProperty(value = "步骤文件名")
    @TableField("PROCESSFILE")
    private String processfile;

    @ApiModelProperty(value = "步骤总数")
    @TableField("TOTALNUM")
    private Integer totalnum;

    @TableField("ISORIGIN")
    private String isorigin;

    @TableField("HANDLESJCCID")
    private String handlesjccid;


}
