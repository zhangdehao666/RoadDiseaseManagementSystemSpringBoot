package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Region;
import com.cumtb.rdmsspring.mapper.RegionMapper;
import com.cumtb.rdmsspring.service.IRegionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cumtb.rdmsspring.util.GlobalUtil;
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
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements IRegionService {

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<Region> getRegionsByProjectId(Integer projectId) {
        return regionMapper.selectList(new QueryWrapper<Region>().eq("projectId",projectId));
    }

    @Override
    public boolean isContained(Region region) {
        return regionMapper.selectById(region.getRegionId()) != null;
    }
}
