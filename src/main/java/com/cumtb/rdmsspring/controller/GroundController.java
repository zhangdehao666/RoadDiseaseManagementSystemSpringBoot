package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.entity.Ground;
import com.cumtb.rdmsspring.service.IGroundService;
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
@RequestMapping("/ground")
@Api(tags = "地层情况")
public class GroundController {

    @Autowired
    private IGroundService iGroundService;

    @ApiOperation(value = "获取地层情况")
    @GetMapping("/{groundId}")
    public Ground getGround(@PathVariable Integer groundId){
        return iGroundService.getById(groundId);
    }

    @ApiOperation(value = "获取所有地层情况")
    @GetMapping("/all")
    public List<Ground> getAllGrounds(){
        return iGroundService.list();
    }

//    @ApiOperation(value = "添加地层情况")

}
