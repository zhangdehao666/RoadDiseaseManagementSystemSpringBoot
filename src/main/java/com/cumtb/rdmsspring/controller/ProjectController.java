package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.bean.ResponseBean;
import com.cumtb.rdmsspring.entity.Project;
import com.cumtb.rdmsspring.service.*;
import com.cumtb.rdmsspring.util.GlobalUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@RestController
@RequestMapping("/project")
@Api(tags = "项目信息")
public class ProjectController {

    @Autowired
    private IProjectService iProjectService;
    @Autowired
    private IAdminService iAdminService;
    @Autowired
    private IDetectionService iDetectionService;

    @ApiOperation(value = "获取可以查看的项目")
    @GetMapping("/all")
    public List<Project> getAllProjects() {
        return iProjectService.list();
    }

    @ApiOperation(value = "获取项目信息")
    @GetMapping("/{projectId}")
    public Project getProject(@PathVariable Integer projectId){
        return iProjectService.getById(projectId);
    }

    @ApiOperation(value = "添加项目信息")
    @PostMapping("/add")
    public ResponseBean addProject(@RequestBody Project project, Principal principal) {
        if (principal == null) {
            return null;
        }
        project.setProjectId(0);
        if (iProjectService.save(project)) {
            return ResponseBean.success("添加成功");
        }
        return ResponseBean.error("添加失败");
    }

    @ApiOperation(value = "更新项目信息")
    @PutMapping("/update")
    public ResponseBean updateProject(@RequestBody Project project) {
        if (iProjectService.updateById(project)) {
            return ResponseBean.success("更新成功");
        }
        return ResponseBean.error("更新失败");
    }

    @ApiOperation(value = "删除项目")
    @DeleteMapping("/{projectId}")
    public ResponseBean deleteProject(@PathVariable Integer projectId) {
        if(!iDetectionService.getDetectionsRemove(projectId)){
            return ResponseBean.deleteError();
        }
        if (iProjectService.removeById(projectId)) {
            return ResponseBean.success("删除成功");
        }
        return ResponseBean.error("删除失败");
    }

}
