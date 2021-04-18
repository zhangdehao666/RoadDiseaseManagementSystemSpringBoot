package com.cumtb.rdmsspring.controller;

import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.AdminLoginParam;
import com.cumtb.rdmsspring.entity.Ryxx;
import com.cumtb.rdmsspring.service.IRyxxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @author zhangdehao
 * 2021/4/17
 */
@RestController
@Api(tags = "AdminLoginController")
public class AdminLoginController {

    @Autowired
    private IRyxxService iRyxxService;

    @ApiOperation(value = "登入之后返回token")
    @PostMapping("/login")
    public ResponseBean login(@RequestBody AdminLoginParam adminLoginParam, HttpServletRequest request){
        return iRyxxService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword(),request);
    }

    @ApiOperation(value = "获取当前用户信息")
    @GetMapping("/ryxx/info")
    public Ryxx getAdminInfo(Principal principal){
        if(principal == null){
            return null;
        }
        String username = principal.getName();
        Ryxx ryxx = iRyxxService.getAdminByUserName(username);
        ryxx.setMm(null);
        return ryxx;
    }

    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public ResponseBean logout(){
        return ResponseBean.success("注销成功");
    }

}
