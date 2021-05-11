package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.entity.Grade;
import com.cumtb.rdmsspring.entity.Type;
import com.cumtb.rdmsspring.service.IGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/grade")
@Api(tags = "灾害源等级")
public class GradeController {

    @Autowired
    private IGradeService iGradeService;

    @ApiOperation(value = "获取灾害源等级")
    @GetMapping("/{gradeId}")
    public Grade getGrade(@PathVariable Integer gradeId){
        return iGradeService.getById(gradeId);
    }

    @ApiOperation(value = "获取所有灾害源等级")
    @GetMapping("/all")
    public List<Grade> getAllGrades(){
        return iGradeService.list();
    }

}
