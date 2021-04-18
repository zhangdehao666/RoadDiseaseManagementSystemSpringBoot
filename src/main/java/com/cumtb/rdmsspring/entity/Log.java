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
@TableName("log")
@ApiModel(value="Log对象", description="")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @ApiModelProperty(value = "日志名称")
    @TableField("RZM")
    private String rzm;

    @TableField("RZSJ")
    private String rzsj;

    @ApiModelProperty(value = "日志内容")
    @TableField("RZNR")
    private String rznr;

    @TableField("IP")
    private String ip;

    @TableField("USERID")
    private String userid;

    private String rybh;

    @TableField("operationTypes")
    private String operationTypes;

    private LocalDateTime time;

    private String username;


}
