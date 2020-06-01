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

import com.atguigu.gulimall.member.entity.MemberMemberTagRelationEntity;
import com.atguigu.gulimall.member.service.MemberMemberTagRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 用户和标签关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/membermembertagrelation")
public class MemberMemberTagRelationController {
    @Autowired
    private MemberMemberTagRelationService memberMemberTagRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:membermembertagrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberMemberTagRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:membermembertagrelation:info")
    public R info(@PathVariable("id") Long id){
		MemberMemberTagRelationEntity memberMemberTagRelation = memberMemberTagRelationService.getById(id);

        return R.ok().put("memberMemberTagRelation", memberMemberTagRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:membermembertagrelation:save")
    public R save(@RequestBody MemberMemberTagRelationEntity memberMemberTagRelation){
		memberMemberTagRelationService.save(memberMemberTagRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:membermembertagrelation:update")
    public R update(@RequestBody MemberMemberTagRelationEntity memberMemberTagRelation){
		memberMemberTagRelationService.updateById(memberMemberTagRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:membermembertagrelation:delete")
    public R delete(@RequestBody Long[] ids){
		memberMemberTagRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
