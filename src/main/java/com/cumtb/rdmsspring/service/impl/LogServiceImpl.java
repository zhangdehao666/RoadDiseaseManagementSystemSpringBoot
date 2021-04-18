package com.cumtb.rdmsspring.service.impl;

import com.cumtb.rdmsspring.entity.Log;
import com.cumtb.rdmsspring.mapper.LogMapper;
import com.cumtb.rdmsspring.service.ILogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
