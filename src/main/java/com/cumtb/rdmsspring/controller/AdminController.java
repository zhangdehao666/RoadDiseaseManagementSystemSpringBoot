package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Admin;
import com.cumtb.rdmsspring.entity.LoginParam;
import com.cumtb.rdmsspring.entity.Role;
import com.cumtb.rdmsspring.service.IAdminService;
import com.cumtb.rdmsspring.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@RestController
@Api(tags = "用户信息")
public class AdminController {

    @Autowired
    private IAdminService iAdminService;
    @Autowired
    private IRoleService iRoleService;

    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public ResponseBean login(@RequestBody LoginParam loginParam, HttpServletRequest request){
        return iAdminService.login(loginParam.getUsername(),loginParam.getPassword(),request);
    }

    @ApiOperation(value = "获取当前用户信息")
    @GetMapping("/admin/info")
    public Admin getAdminInfo(Principal principal){
        if(principal == null){
            return null;
        }
        String username = principal.getName();
        Admin admin = iAdminService.getAdminByUserName(username);
        return admin;
    }

    @ApiOperation(value = "获取用户角色")
    @GetMapping("/admin/role")
    public Role getRole(Principal principal){
        if(principal == null){
            return null;
        }
        Admin admin = iAdminService.getAdminByUserName(principal.getName());
        return iRoleService.getById(admin.getRoleId());
    }

    @ApiOperation(value = "修改用户信息")
    @PutMapping("/admin/update")
    public ResponseBean updateAdmin(@RequestBody Admin admin){
        if(iAdminService.updateById(admin)){
            return ResponseBean.updateSuccess();
        }
        return ResponseBean.updateError();
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("/admin/add")
    public ResponseBean addAdmin(@RequestBody Admin admin){
        admin.setAdminId(0);
        if(iAdminService.save(admin)){
            return ResponseBean.addSuccess();
        }
        return ResponseBean.addError();
    }

    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public ResponseBean logout(){
        return ResponseBean.success("注销成功");
    }

}
