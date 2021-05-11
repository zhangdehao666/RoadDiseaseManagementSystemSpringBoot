package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Region;
import com.cumtb.rdmsspring.service.IRegionService;
import com.cumtb.rdmsspring.util.GlobalUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
@RequestMapping("/region")
@Api(tags = "探测区域")
public class RegionController {

    @Autowired
    private IRegionService iRegionService;

    @ApiOperation(value = "获取项目的探测区域")
    @GetMapping("/{projectId}")
    public List<Region> getRegions(@PathVariable Integer projectId){
        return iRegionService.getRegionsByProjectId(projectId);
    }

    @ApiOperation(value = "添加项目的探测区域")
    @PostMapping("/add/{projectId}")
    public ResponseBean addRegions(@RequestBody List<Region> regions,@PathVariable Integer projectId){
        for(Region region : regions){
            region.setProjectId(projectId);
            if(iRegionService.isContained(region)){
                if(!iRegionService.updateById(region)){
                    return ResponseBean.addError();
                }
            }else {
                if(!iRegionService.save(region)){
                    return ResponseBean.addError();
                }
            }
        }
        return ResponseBean.addSuccess();
    }

    @ApiOperation(value = "更新探测区域信息")
    @PutMapping("/update")
    public ResponseBean updateRegion(@RequestBody Region region){
        if(iRegionService.updateById(region)){
            return ResponseBean.success("更新成功");
        }
        return ResponseBean.error("更新失败");
    }

    @ApiOperation(value = "删除项目的探测区域")
    @DeleteMapping("/delete/{regionId}")
    public ResponseBean deleteRegion(@PathVariable Integer regionId){
        if(iRegionService.removeById(regionId)){
            return ResponseBean.success("删除成功");
        }
        return ResponseBean.error("删除失败");
    }

}
