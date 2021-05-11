package com.cumtb.rdmsspring.service.impl;

import com.cumtb.rdmsspring.entity.Type;
import com.cumtb.rdmsspring.mapper.TypeMapper;
import com.cumtb.rdmsspring.service.ITypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
