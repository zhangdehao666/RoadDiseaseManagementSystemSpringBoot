package com.cumtb.rdmsspring.service.impl;

import com.cumtb.rdmsspring.entity.Role;
import com.cumtb.rdmsspring.mapper.RoleMapper;
import com.cumtb.rdmsspring.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-17
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
