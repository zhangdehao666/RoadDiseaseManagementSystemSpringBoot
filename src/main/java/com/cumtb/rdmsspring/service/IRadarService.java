package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.entity.Radar;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cumtb.rdmsspring.entity.Repair;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
public interface IRadarService extends IService<Radar> {

    Radar getRadar(Integer detectionId);

    boolean isContained(Radar radar);

    boolean getRadarRemove(Integer detectionId);

}
