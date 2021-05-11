package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Detection;
import com.cumtb.rdmsspring.mapper.DetectionMapper;
import com.cumtb.rdmsspring.service.*;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@Service
public class DetectionServiceImpl extends ServiceImpl<DetectionMapper, Detection> implements IDetectionService {

    @Autowired
    private DetectionMapper detectionMapper;
    @Autowired
    private IRepairService iRepairService;
    @Autowired
    private IInstrumentService iInstrumentService;
    @Autowired
    private IRadarService iRadarService;
    @Autowired
    private IDiseaseService iDiseaseService;

    @Override
    public List<Detection> getDetections(Integer projectId) {
        return detectionMapper.selectList(new QueryWrapper<Detection>().eq("projectId", projectId));
    }

    @Override
    public boolean getDetectionsRemove(Integer projectId) {
        List<Detection> detections = getDetections(projectId);
        for (Detection detection : detections) {
            Integer detectionId = detection.getDetectionId();
            if(!iRepairService.getRepairRemove(detectionId)){
                return false;
            }
            if(!iInstrumentService.getInstrumentRemove(detectionId)){
                return false;
            }
            if(!iRadarService.getRadarRemove(detectionId)){
                return false;
            }
            if(!iDiseaseService.getDiseasesRemove(detectionId)){
                return false;
            }
            if(!removeById(detectionId)){
                return false;
            }
        }
        return true;
    }

}
