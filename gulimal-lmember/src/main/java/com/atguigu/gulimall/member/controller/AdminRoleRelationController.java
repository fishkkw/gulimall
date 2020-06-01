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

import com.atguigu.gulimall.member.entity.AdminRoleRelationEntity;
import com.atguigu.gulimall.member.service.AdminRoleRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 后台用户和角色关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/adminrolerelation")
public class AdminRoleRelationController {
    @Autowired
    private AdminRoleRelationService adminRoleRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:adminrolerelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adminRoleRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:adminrolerelation:info")
    public R info(@PathVariable("id") Long id){
		AdminRoleRelationEntity adminRoleRelation = adminRoleRelationService.getById(id);

        return R.ok().put("adminRoleRelation", adminRoleRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:adminrolerelation:save")
    public R save(@RequestBody AdminRoleRelationEntity adminRoleRelation){
		adminRoleRelationService.save(adminRoleRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:adminrolerelation:update")
    public R update(@RequestBody AdminRoleRelationEntity adminRoleRelation){
		adminRoleRelationService.updateById(adminRoleRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:adminrolerelation:delete")
    public R delete(@RequestBody Long[] ids){
		adminRoleRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
