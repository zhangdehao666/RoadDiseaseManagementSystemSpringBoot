package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Instrument;
import com.cumtb.rdmsspring.entity.Repair;
import com.cumtb.rdmsspring.service.IInstrumentService;
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
@RequestMapping("/instrument")
@Api(tags = "仪器及采集参数信息")
public class InstrumentController {

    @Autowired
    private IInstrumentService iInstrumentService;

    @ApiOperation(value = "获取仪器参数信息")
    @GetMapping("/{detectionId}")
    public Instrument getInstrument(@PathVariable Integer detectionId){
        return iInstrumentService.getInstrument(detectionId);
    }

    @ApiOperation(value = "添加仪器参数信息")
    @PostMapping("/add/{detectionId}")
    public ResponseBean addInstrument(@RequestBody Instrument instrument, @PathVariable Integer detectionId){
        instrument.setDetectionId(detectionId);
        if(iInstrumentService.isContained(instrument)){
            if(iInstrumentService.updateById(instrument)){
                return ResponseBean.addSuccess();
            }
        }else {
            instrument.setInstrumentId(0);
            if(iInstrumentService.save(instrument)){
                return ResponseBean.addSuccess();
            }
        }
        return ResponseBean.addError();
    }

}
