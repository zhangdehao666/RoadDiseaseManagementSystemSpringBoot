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
@TableName("instrument")
@ApiModel(value="Instrument对象", description="")
public class Instrument implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("instrumentId")
    private Integer instrumentId;

    private String number;

    @TableField("antennaNumber")
    private String antennaNumber;

    @TableField("antennaFrequency")
    private String antennaFrequency;

    private String host;

    @TableField("timeWindow")
    private String timeWindow;

    private String points;

    private String channels;

    @TableField("touchId")
    private Integer touchId;

    @TableField("wheelSpace")
    private String wheelSpace;

    @TableField("gridSpace")
    private String gridSpace;

    @TableField("imageSpace")
    private String imageSpace;

    private String space;

    @TableField("detectionId")
    private Integer detectionId;


}
