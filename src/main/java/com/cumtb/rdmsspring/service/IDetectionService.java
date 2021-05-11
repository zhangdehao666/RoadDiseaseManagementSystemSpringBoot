package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.entity.Detection;
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
public interface IDetectionService extends IService<Detection> {

    List<Detection> getDetections(Integer projectId);

    boolean getDetectionsRemove(Integer projectId);

}
