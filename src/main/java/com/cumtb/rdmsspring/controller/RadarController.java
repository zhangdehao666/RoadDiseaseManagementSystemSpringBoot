package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Instrument;
import com.cumtb.rdmsspring.entity.Radar;
import com.cumtb.rdmsspring.entity.Repair;
import com.cumtb.rdmsspring.service.IInstrumentService;
import com.cumtb.rdmsspring.service.IRadarService;
import com.cumtb.rdmsspring.util.GlobalUtil;
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
@RequestMapping("/radar")
@Api(tags = "雷达数据")
public class RadarController {

    @Autowired
    private IRadarService iRadarService;

    @ApiOperation(value = "获取雷达数据信息")
    @GetMapping("/{detectionId}")
    public Radar getRadar(@PathVariable Integer detectionId){
        return iRadarService.getRadar(detectionId);
    }

    @ApiOperation(value = "添加雷达数据信息")
    @PostMapping("/add/{detectionId}")
    public ResponseBean addRadar(@RequestBody Radar radar, @PathVariable Integer detectionId){
        radar.setDetectionId(detectionId);
        if(iRadarService.isContained(radar)){
            if(iRadarService.updateById(radar)){
                return ResponseBean.addSuccess();
            }
        }else {
            radar.setRadarId(0);
            if(iRadarService.save(radar)){
                return ResponseBean.addSuccess();
            }
        }
        return ResponseBean.addError();
    }

}
