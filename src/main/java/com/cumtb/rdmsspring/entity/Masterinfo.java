package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("masterinfo")
@ApiModel(value="Masterinfo对象", description="")
public class Masterinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("IDCard")
    private String IDCard;

    private String address;

    private Integer authority;

    private LocalDate birthdate;

    private LocalDate createtime;

    private String email;

    @TableField("endTime")
    private LocalDate endTime;

    @TableField("logonCode")
    private String logonCode;

    private String mac;

    private String name;

    private String note;

    private String password;

    @TableField("phoneNum")
    private String phoneNum;

    @TableField("sampleTime")
    private Integer sampleTime;

    private Integer sex;

    private Integer status;

    @TableField("transferTime")
    private Integer transferTime;

    @TableField("uniqueID")
    private String uniqueID;


}
