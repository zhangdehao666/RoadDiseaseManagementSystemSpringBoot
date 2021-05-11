package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.entity.Touch;
import com.cumtb.rdmsspring.service.ITouchService;
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
 * @since 2021-05-06
 */
@RestController
@RequestMapping("/touch")
@Api(tags = "触发方式")
public class TouchController {

    @Autowired
    private ITouchService iTouchService;

    @ApiOperation(value = "获取触发方式")
    @GetMapping("/{touchId}")
    public Touch getTouch(@PathVariable Integer touchId){
        return iTouchService.getById(touchId);
    }

    @ApiOperation(value = "获取所有触发方式")
    @GetMapping("/all")
    public List<Touch> getAllTouchs(){
        return iTouchService.list();
    }

}
