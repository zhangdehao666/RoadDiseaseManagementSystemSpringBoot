package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Disease;
import com.cumtb.rdmsspring.service.IDiseaseService;
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
@RequestMapping("/disease")
@Api(tags = "灾害源信息")
public class DiseaseController {

    @Autowired
    private IDiseaseService iDiseaseService;

    @ApiOperation(value = "获取测线的灾害源信息")
    @GetMapping("/{detectionId}")
    public List<Disease> getDiseases(@PathVariable Integer detectionId){
        return iDiseaseService.getDiseases(detectionId);
    }

    @ApiOperation(value = "获取灾害源信息")
    @GetMapping("/getOne/{diseaseId}")
    public Disease getDisease(@PathVariable Integer diseaseId){
        return iDiseaseService.getById(diseaseId);
    }

    @ApiOperation(value = "添加灾害源信息")
    @PostMapping("/add/{detectionId}")
    public ResponseBean addDisease(@RequestBody Disease disease,@PathVariable Integer detectionId){
        disease.setDetectionId(detectionId);
        if(iDiseaseService.isContained(disease.getDiseaseId())){
            if(!iDiseaseService.updateById(disease)){
                return ResponseBean.addError();
            }
        }else {
            disease.setDiseaseId(0);
            if(!iDiseaseService.save(disease)){
                return ResponseBean.addError();
            }
        }
        return ResponseBean.addSuccess();
    }

    @ApiOperation(value = "删除灾害源信息")
    @DeleteMapping("/delete/{diseaseId}")
    public ResponseBean deleteDisease(@PathVariable Integer diseaseId){
        if(iDiseaseService.removeById(diseaseId)){
            return ResponseBean.deleteSuccess();
        }
        return ResponseBean.deleteError();
    }

}
