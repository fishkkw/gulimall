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

import com.atguigu.gulimall.member.entity.MemberTaskEntity;
import com.atguigu.gulimall.member.service.MemberTaskService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 会员任务表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/membertask")
public class MemberTaskController {
    @Autowired
    private MemberTaskService memberTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:membertask:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberTaskService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:membertask:info")
    public R info(@PathVariable("id") Long id){
		MemberTaskEntity memberTask = memberTaskService.getById(id);

        return R.ok().put("memberTask", memberTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:membertask:save")
    public R save(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.save(memberTask);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:membertask:update")
    public R update(@RequestBody MemberTaskEntity memberTask){
		memberTaskService.updateById(memberTask);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:membertask:delete")
    public R delete(@RequestBody Long[] ids){
		memberTaskService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
