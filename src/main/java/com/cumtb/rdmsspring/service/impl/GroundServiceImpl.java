package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Ground;
import com.cumtb.rdmsspring.mapper.GroundMapper;
import com.cumtb.rdmsspring.service.IGroundService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class GroundServiceImpl extends ServiceImpl<GroundMapper, Ground> implements IGroundService {

    @Autowired
    private GroundMapper groundMapper;

}
