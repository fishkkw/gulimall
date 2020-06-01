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

import com.atguigu.gulimall.member.entity.AdminPermissionRelationEntity;
import com.atguigu.gulimall.member.service.AdminPermissionRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/adminpermissionrelation")
public class AdminPermissionRelationController {
    @Autowired
    private AdminPermissionRelationService adminPermissionRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:adminpermissionrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adminPermissionRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:adminpermissionrelation:info")
    public R info(@PathVariable("id") Long id){
		AdminPermissionRelationEntity adminPermissionRelation = adminPermissionRelationService.getById(id);

        return R.ok().put("adminPermissionRelation", adminPermissionRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:adminpermissionrelation:save")
    public R save(@RequestBody AdminPermissionRelationEntity adminPermissionRelation){
		adminPermissionRelationService.save(adminPermissionRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:adminpermissionrelation:update")
    public R update(@RequestBody AdminPermissionRelationEntity adminPermissionRelation){
		adminPermissionRelationService.updateById(adminPermissionRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:adminpermissionrelation:delete")
    public R delete(@RequestBody Long[] ids){
		adminPermissionRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
