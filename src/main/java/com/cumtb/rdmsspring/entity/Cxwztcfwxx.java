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
@TableName("cxwztcfwxx")
@ApiModel(value="Cxwztcfwxx对象", description="")
public class Cxwztcfwxx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CXWZTCFWXXID")
    private String cxwztcfwxxid;

    @TableField("XTFWBH")
    private String xtfwbh;

    @TableField("TCCSH")
    private Integer tccsh;

    @TableField("TCQSHRQSHJ")
    private String tcqshrqshj;

    @TableField("TCJSHRQSHJ")
    private String tcjshrqshj;

    @TableField("XMLXXXID")
    private String xmlxxxid;


}
