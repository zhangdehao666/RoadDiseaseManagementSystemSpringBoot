package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Radar;
import com.cumtb.rdmsspring.mapper.RadarMapper;
import com.cumtb.rdmsspring.service.IRadarService;
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
public class RadarServiceImpl extends ServiceImpl<RadarMapper, Radar> implements IRadarService {

    @Autowired
    private RadarMapper radarMapper;

    @Override
    public Radar getRadar(Integer detectionId) {
        return radarMapper.selectOne(new QueryWrapper<Radar>().eq("detectionId",detectionId));
    }

    @Override
    public boolean isContained(Radar radar) {
        return radarMapper.selectById(radar.getRadarId()) != null;
    }

    @Override
    public boolean getRadarRemove(Integer detectionId) {
        Radar radar = radarMapper.selectOne(new QueryWrapper<Radar>().eq("detectionId",detectionId));
        if(radar != null){
            return removeById(radar.getRadarId());
        }
        return true;
    }
}
