package com.cumtb.rdmsspring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Collection;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

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
@TableName("ryxx")
@ApiModel(value="Ryxx对象", description="")
public class Ryxx implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    @TableId("RYBH")
    private String rybh;

    @TableField("YHM")
    private String yhm;

    @TableField("ZHH")
    private String zhh;

    @TableField("MM")
    private String mm;

    @TableField("SHFSHX")
    private String shfshx;

    @TableField("ZHHJLSHJ")
    private String zhhjlshj;

    @TableField("ZXDRSHJ")
    private String zxdrshj;

    @TableField("ZDRCSH")
    private Integer zdrcsh;

    @TableField("SHFZHX")
    private String shfzhx;

    private String companyid;

    private Integer orgid;

    @TableField("shfshxName")
    private String shfshxName;

    @TableField("shfzhxName")
    private String shfzhxName;

    private String roleid;

    private String yxqshshj;

    private String yxzhzhshj;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return mm;
    }

    @Override
    public String getUsername() {
        return zhh;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
