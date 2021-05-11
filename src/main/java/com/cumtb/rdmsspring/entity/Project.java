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
@TableName("project")
@ApiModel(value="Project对象", description="")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("projectId")
    private Integer projectId;

    @ApiModelProperty(value = "项目编号",required = true)
    private String number;

    @ApiModelProperty(value = "项目名称",required = true)
    private String name;

    @TableField("detectCompanyNumber")
    private String detectCompanyNumber;

    @ApiModelProperty(value = "探测单位",required = true)
    @TableField("detectCompany")
    private String detectCompany;

    @ApiModelProperty(value = "委托单位",required = true)
    @TableField("entrustCompany")
    private String entrustCompany;

    private String director;

    private String participants;

    private String supervisors;

    private String apply;

    @TableField("applyPath")
    private String applyPath;

    private String reply;

    @TableField("replyPath")
    private String replyPath;

    private String contract;

    @TableField("contractPath")
    private String contractPath;

    private String book;

    @TableField("bookPath")
    private String bookPath;

    @ApiModelProperty(value = "起始时间",required = true)
    @TableField("startTime")
    private String startTime;

    @ApiModelProperty(value = "结束时间",required = true)
    @TableField("endTime")
    private String endTime;

}
