package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.entity.Disease;
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
public interface IDiseaseService extends IService<Disease> {

    List<Disease> getDiseases(Integer detectionId);

    boolean isContained(Integer diseaseId);

    boolean getDiseasesRemove(Integer detectionId);

}
