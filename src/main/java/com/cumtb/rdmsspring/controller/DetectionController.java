package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Detection;
import com.cumtb.rdmsspring.service.*;
import com.cumtb.rdmsspring.util.GlobalUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@RestController
@RequestMapping("/detection")
@Api(tags = "测线位置")
public class DetectionController {

    @Autowired
    private IDetectionService iDetectionService;
    @Autowired
    private IRepairService iRepairService;
    @Autowired
    private IInstrumentService iInstrumentService;
    @Autowired
    private IRadarService iRadarService;
    @Autowired
    private IDiseaseService iDiseaseService;

    @ApiOperation(value = "获取可查看的测线位置信息")
    @GetMapping("/all/{projectId}")
    public List<Detection> getDetections(@PathVariable Integer projectId){
        return iDetectionService.getDetections(projectId);
    }

    @ApiOperation(value = "获取测线位置信息")
    @GetMapping("/{detectionId}")
    public Detection getDetection(@PathVariable Integer detectionId){
        return iDetectionService.getById(detectionId);
    }

    @ApiOperation(value = "添加测线位置信息")
    @PostMapping("/add/{projectId}")
    public ResponseBean addDetection(@RequestBody Detection detection,@PathVariable Integer projectId){
        detection.setDetectionId(0);
        detection.setProjectId(projectId);
        if(iDetectionService.save(detection)){
            return ResponseBean.addSuccess();
        }
        return ResponseBean.addError();
    }

    @ApiOperation(value = "更新测线信息")
    @PutMapping("/update")
    public ResponseBean updateDetection(@RequestBody Detection detection){
        if(iDetectionService.updateById(detection)){
            return ResponseBean.updateSuccess();
        }
        return ResponseBean.updateError();
    }

    @ApiOperation(value = "删除测线位置信息")
    @DeleteMapping("/delete/{detectionId}")
    public ResponseBean deleteDetection(@PathVariable Integer detectionId){
        if(!iRepairService.getRepairRemove(detectionId)){
            return ResponseBean.deleteError();
        }
        if(!iInstrumentService.getInstrumentRemove(detectionId)){
            return ResponseBean.deleteError();
        }
        if(!iRadarService.getRadarRemove(detectionId)){
            return ResponseBean.deleteError();
        }
        if(!iDiseaseService.getDiseasesRemove(detectionId)){
            return ResponseBean.deleteError();
        }
        if(iDetectionService.removeById(detectionId)){
            return ResponseBean.deleteSuccess();
        }
        return ResponseBean.deleteError();
    }

}
