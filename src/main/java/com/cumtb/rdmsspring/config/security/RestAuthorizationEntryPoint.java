package com.cumtb.rdmsspring.config.security;

import com.cumtb.rdmsspring.bean.ResponseBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 当未登录或者token失效时访问接口，自定义的返回结果
 * @author zhangdehao
 * 2021/4/17
 */
@Component
public class RestAuthorizationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        PrintWriter out = httpServletResponse.getWriter();
        ResponseBean bean = ResponseBean.error("尚未登录");
        bean.setCode(401);
        out.write(new ObjectMapper().writeValueAsString(bean));
        out.flush();
        out.close();
    }
}
