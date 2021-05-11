package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Report;
import com.cumtb.rdmsspring.service.IReportService;
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
@RequestMapping("/report")
@Api(tags = "项目报告书")
public class ReportController {

    @Autowired
    private IReportService iReportService;

    @ApiOperation(value = "查看项目计划书")
    @GetMapping("/{projectId}")
    public List<Report> getReports(@PathVariable Integer projectId){
        return iReportService.getReports(projectId);
    }

    @ApiOperation(value = "添加项目计划书")
    @PostMapping("/add/{projectId}")
    public ResponseBean addReport(@RequestBody List<Report> reports, @PathVariable Integer projectId){
        for(Report report : reports){
            report.setProjectId(projectId);
            if(iReportService.isContained(report)){
                if(!iReportService.updateById(report)){
                    return ResponseBean.addError();
                }
            }else{
                if(!iReportService.save(report)){
                    return ResponseBean.addError();
                }
            }
        }
        return ResponseBean.addSuccess();
    }

    @ApiOperation(value = "更新项目计划书")
    @PutMapping("/update")
    public ResponseBean updateReport(@RequestBody Report report){
        if(iReportService.updateById(report)){
            return ResponseBean.success("更新成功");
        }
        return ResponseBean.error("更新失败");
    }

    @ApiOperation(value = "删除项目计划书")
    @DeleteMapping("/delete/{reportId}")
    public ResponseBean deleteReport(@PathVariable Integer reportId){
        if(iReportService.removeById(reportId)){
            return ResponseBean.success("删除成功");
        }
        return ResponseBean.error("删除失败");
    }

}
