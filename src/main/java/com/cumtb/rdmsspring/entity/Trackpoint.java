package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("trackpoint")
@ApiModel(value="Trackpoint对象", description="")
public class Trackpoint implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("trackPointID")
    private String trackPointID;

    @TableField("endTime")
    private LocalDateTime endTime;

    @TableField("fileSource")
    private String fileSource;

    @TableField("startTime")
    private LocalDateTime startTime;


}
