package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Plan;
import com.cumtb.rdmsspring.mapper.PlanMapper;
import com.cumtb.rdmsspring.service.IPlanService;
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
@RequestMapping("/plan")
@Api(tags = "项目计划书")
public class PlanController {

    @Autowired
    private IPlanService iPlanService;

    @ApiOperation(value = "查看项目计划书")
    @GetMapping("/{projectId}")
    public List<Plan> getPlans(@PathVariable Integer projectId){
        return iPlanService.getPlans(projectId);
    }

    @ApiOperation(value = "添加项目计划书")
    @PostMapping("/add/{projectId}")
    public ResponseBean addPlan(@RequestBody List<Plan> plans,@PathVariable Integer projectId){
        for(Plan plan : plans){
            plan.setProjectId(projectId);
            if(iPlanService.isContained(plan)){
                if(!iPlanService.updateById(plan)){
                    return ResponseBean.addError();
                }
            }else {
                if(!iPlanService.save(plan)){
                    return ResponseBean.addError();
                }
            }
        }
        return ResponseBean.addSuccess();
    }

    @ApiOperation(value = "更新项目计划书")
    @PutMapping("/update")
    public ResponseBean updatePlan(@RequestBody Plan plan){
        if(iPlanService.updateById(plan)){
            return ResponseBean.success("更新成功");
        }
        return ResponseBean.error("更新失败");
    }

    @ApiOperation(value = "删除项目计划书")
    @DeleteMapping("/delete/{planId}")
    public ResponseBean deletePlan(@PathVariable Integer planId){
        if(iPlanService.removeById(planId)){
            return ResponseBean.success("删除成功");
        }
        return ResponseBean.error("删除失败");
    }

}
