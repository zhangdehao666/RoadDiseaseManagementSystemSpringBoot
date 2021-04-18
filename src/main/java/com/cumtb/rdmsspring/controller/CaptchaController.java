package com.cumtb.rdmsspring.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证码
 * @author zhangdehao
 * 2021/4/18
 */

@RestController
public class CaptchaController {

    @ApiOperation(value = "验证码")
    @GetMapping(value = "/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response){
        //定义response输出类型为image/jpeg类型
        response.setDateHeader("Expires",0);
        //Set standard HTTP/1.1 no-cache headers
        response.setHeader("Cache-Control","no-store,no-cache,must-revalidate");
        //Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control","post-check=0,pre-check=0");
        //Set standard HTTP/1.0 no-cache header
        response.setHeader("Pragma","no-cache");
        //return a jpeg
        response.setContentType("image/jpeg");
        //-----------生成验证码begin------------

        //-----------生成验证码end------------
    }
}
