package com.cumtb.rdmsspring.controller;


import com.cumtb.rdmsspring.entity.Grade;
import com.cumtb.rdmsspring.entity.Role;
import com.cumtb.rdmsspring.service.IGradeService;
import com.cumtb.rdmsspring.service.IRoleService;
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
@RequestMapping("/role")
@Api(tags = "用户角色")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @ApiOperation(value = "获取用户角色")
    @GetMapping("/{roleId}")
    public Role getRole(@PathVariable Integer roleId){
        return iRoleService.getById(roleId);
    }

    @ApiOperation(value = "获取全部角色")
    @GetMapping("/all")
    public List<Role> getAllRoles(){
        return iRoleService.list();
    }

}
