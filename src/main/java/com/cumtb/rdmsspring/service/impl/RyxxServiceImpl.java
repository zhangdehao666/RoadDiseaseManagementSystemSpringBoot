package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.config.security.JwtTokenUtil;
import com.cumtb.rdmsspring.entity.Ryxx;
import com.cumtb.rdmsspring.mapper.RyxxMapper;
import com.cumtb.rdmsspring.service.IRyxxService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cumtb.rdmsspring.util.GlobalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-17
 */
@Service
public class RyxxServiceImpl extends ServiceImpl<RyxxMapper, Ryxx> implements IRyxxService {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private RyxxMapper ryxxMapper;

    /**
     * 登录后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    @Override
    public ResponseBean login(String username, String password, HttpServletRequest request) {
        // 登录
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(userDetails == null || !passwordEncoder.matches(password,passwordEncoder.encode(userDetails.getPassword()))){
            return ResponseBean.error("用户名或密码不正确");
        }
        if(!userDetails.isEnabled()){
            return ResponseBean.error("账号禁用");
        }
        // 更新security登录用户信息
        UsernamePasswordAuthenticationToken authenticationToken = new
                UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        // 生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return ResponseBean.success("登入成功",tokenMap);
    }

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    @Override
    public Ryxx getAdminByUserName(String username) {
        return ryxxMapper.selectOne(new QueryWrapper<Ryxx>().eq("ZHH",username));
    }
}
