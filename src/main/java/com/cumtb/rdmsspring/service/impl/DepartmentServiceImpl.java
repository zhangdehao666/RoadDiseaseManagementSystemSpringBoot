package com.cumtb.rdmsspring.service.impl;

import com.cumtb.rdmsspring.entity.Department;
import com.cumtb.rdmsspring.mapper.DepartmentMapper;
import com.cumtb.rdmsspring.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
