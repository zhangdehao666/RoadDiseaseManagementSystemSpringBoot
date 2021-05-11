package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.entity.Repair;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
public interface IRepairService extends IService<Repair> {

    Repair getRepair(Integer detectionId);

    boolean isContained(Repair repair);

    boolean getRepairRemove(Integer detectionId);

}
