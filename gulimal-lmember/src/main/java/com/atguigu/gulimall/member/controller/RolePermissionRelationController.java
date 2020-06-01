package com.atguigu.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.member.entity.RolePermissionRelationEntity;
import com.atguigu.gulimall.member.service.RolePermissionRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 后台用户角色和权限关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/rolepermissionrelation")
public class RolePermissionRelationController {
    @Autowired
    private RolePermissionRelationService rolePermissionRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:rolepermissionrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = rolePermissionRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:rolepermissionrelation:info")
    public R info(@PathVariable("id") Long id){
		RolePermissionRelationEntity rolePermissionRelation = rolePermissionRelationService.getById(id);

        return R.ok().put("rolePermissionRelation", rolePermissionRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:rolepermissionrelation:save")
    public R save(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.save(rolePermissionRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:rolepermissionrelation:update")
    public R update(@RequestBody RolePermissionRelationEntity rolePermissionRelation){
		rolePermissionRelationService.updateById(rolePermissionRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:rolepermissionrelation:delete")
    public R delete(@RequestBody Long[] ids){
		rolePermissionRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
