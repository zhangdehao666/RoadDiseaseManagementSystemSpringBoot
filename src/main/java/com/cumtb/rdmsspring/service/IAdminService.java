package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    ResponseBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
