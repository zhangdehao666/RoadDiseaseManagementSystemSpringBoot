package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.entity.Region;
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
public interface IRegionService extends IService<Region> {

    List<Region> getRegionsByProjectId(Integer projectId);

    boolean isContained(Region region);
}
