package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("specialauthority")
@ApiModel(value="Specialauthority对象", description="")
public class Specialauthority implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rybh;

    private String xmbh;

    private String xmmc;

    private String yhm;

    private String ryxxId;

    private String xmlxxxId;

    private String xmlxxxid;


}
