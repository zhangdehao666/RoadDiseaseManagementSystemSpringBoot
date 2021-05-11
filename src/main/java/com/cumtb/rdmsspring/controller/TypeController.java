package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.entity.Grade;
import com.cumtb.rdmsspring.entity.Ground;
import com.cumtb.rdmsspring.entity.Type;
import com.cumtb.rdmsspring.service.IGradeService;
import com.cumtb.rdmsspring.service.ITypeService;
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
@RequestMapping("/type")
@Api(tags = "灾害源类型")
public class TypeController {

    @Autowired
    private ITypeService iTypeService;

    @ApiOperation(value = "获取灾害源类型")
    @GetMapping("/{typeId}")
    public Type getGrade(@PathVariable Integer typeId){
        return iTypeService.getById(typeId);
    }

    @ApiOperation(value = "获取所有灾害源类型")
    @GetMapping("/all")
    public List<Type> getAllTypes(){
        return iTypeService.list();
    }

}
