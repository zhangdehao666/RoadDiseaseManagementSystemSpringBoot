package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Radar;
import com.cumtb.rdmsspring.entity.Repair;
import com.cumtb.rdmsspring.service.IRadarService;
import com.cumtb.rdmsspring.service.IRepairService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@RestController
@RequestMapping("/repair")
@Api(tags = "灾害修护")
public class RepairController {

    @Autowired
    private IRepairService iRepairService;

    @ApiOperation(value = "获取灾害修护信息")
    @GetMapping("/{detectionId}")
    public Repair getRepair(@PathVariable Integer detectionId){
        return iRepairService.getRepair(detectionId);
    }

    @ApiOperation(value = "添加灾害修护信息")
    @PostMapping("/add/{detectionId}")
    public ResponseBean addRepair(@RequestBody Repair repair,@PathVariable Integer detectionId){
        repair.setDetectionId(detectionId);
        if(iRepairService.isContained(repair)){
            if(iRepairService.updateById(repair)){
                return ResponseBean.addSuccess();
            }
        }else {
            repair.setRepairId(0);
            if(iRepairService.save(repair)){
                return ResponseBean.addSuccess();
            }
        }
        return ResponseBean.addError();
    }

}
