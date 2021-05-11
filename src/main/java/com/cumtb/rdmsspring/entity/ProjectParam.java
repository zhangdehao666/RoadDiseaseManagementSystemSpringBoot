package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author zhangdehao
 * 2021/4/30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "ProjectAdd对象",description = "")
public class ProjectParam {

    private Integer projectId;
    private String number;
    private String name;
    private String detectCompanyNumber;
    private String detectCompany;
    private String entrustCompany;
    private String director;
    private String participants;
    private String supervisors;
    private String apply;
    private String applyPath;
    private String reply;
    private String replyPath;
    private String contract;
    private String contractPath;
    private String book;
    private String bookPath;
    private String startTime;
    private String endTime;
    private Integer companyId;

}
