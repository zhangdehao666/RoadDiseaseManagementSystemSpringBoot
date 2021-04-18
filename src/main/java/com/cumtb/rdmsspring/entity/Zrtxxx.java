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
@TableName("zrtxxx")
@ApiModel(value="Zrtxxx对象", description="")
public class Zrtxxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ZRTXXXID")
    private String zrtxxxid;

    @TableField("BHBH")
    private String bhbh;

    @TableField("BHLY")
    private String bhly;

    @TableField("BHZHJ")
    private String bhzhj;

    @TableField("BHZHXWZH")
    private String bhzhxwzh;

    @TableField("BHSHD")
    private String bhshd;

    @TableField("XCHBHZHPWJM")
    private String xchbhzhpwjm;

    @TableField("BHTPLJ")
    private String bhtplj;

    @TableField("BHMSH")
    private String bhmsh;


}
