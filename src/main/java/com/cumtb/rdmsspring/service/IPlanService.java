package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.entity.Plan;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
public interface IPlanService extends IService<Plan> {

    List<Plan> getPlans(Integer projectId);

    boolean isContained(Plan plan);
}
