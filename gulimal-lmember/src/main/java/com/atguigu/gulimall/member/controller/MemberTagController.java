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

import com.atguigu.gulimall.member.entity.MemberTagEntity;
import com.atguigu.gulimall.member.service.MemberTagService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 用户标签表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/membertag")
public class MemberTagController {
    @Autowired
    private MemberTagService memberTagService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:membertag:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberTagService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:membertag:info")
    public R info(@PathVariable("id") Long id){
		MemberTagEntity memberTag = memberTagService.getById(id);

        return R.ok().put("memberTag", memberTag);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:membertag:save")
    public R save(@RequestBody MemberTagEntity memberTag){
		memberTagService.save(memberTag);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:membertag:update")
    public R update(@RequestBody MemberTagEntity memberTag){
		memberTagService.updateById(memberTag);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:membertag:delete")
    public R delete(@RequestBody Long[] ids){
		memberTagService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
