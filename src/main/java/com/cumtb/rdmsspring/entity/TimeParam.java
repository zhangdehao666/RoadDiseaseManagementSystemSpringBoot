package com.cumtb.rdmsspring.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 时间参数实体类
 * @author zhangdehao
 * 2021/4/22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "TimeParam对象",description = "")
public class TimeParam {

    @ApiModelProperty(value = "年月日")
    private String date;
    @ApiModelProperty(value = "时分秒")
    private String time;
}
