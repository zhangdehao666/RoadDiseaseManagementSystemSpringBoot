package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Plan;
import com.cumtb.rdmsspring.mapper.PlanMapper;
import com.cumtb.rdmsspring.service.IPlanService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@Service
public class PlanServiceImpl extends ServiceImpl<PlanMapper, Plan> implements IPlanService {

    @Autowired
    private PlanMapper planMapper;

    @Override
    public List<Plan> getPlans(Integer projectId) {
        return planMapper.selectList(new QueryWrapper<Plan>().eq("projectId",projectId));
    }

    @Override
    public boolean isContained(Plan plan) {
        return planMapper.selectById(plan.getPlanId()) != null;
    }
}
