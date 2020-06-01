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

import com.atguigu.gulimall.member.entity.MemberRuleSettingEntity;
import com.atguigu.gulimall.member.service.MemberRuleSettingService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 会员积分成长规则表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/memberrulesetting")
public class MemberRuleSettingController {
    @Autowired
    private MemberRuleSettingService memberRuleSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:memberrulesetting:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberRuleSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:memberrulesetting:info")
    public R info(@PathVariable("id") Long id){
		MemberRuleSettingEntity memberRuleSetting = memberRuleSettingService.getById(id);

        return R.ok().put("memberRuleSetting", memberRuleSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:memberrulesetting:save")
    public R save(@RequestBody MemberRuleSettingEntity memberRuleSetting){
		memberRuleSettingService.save(memberRuleSetting);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:memberrulesetting:update")
    public R update(@RequestBody MemberRuleSettingEntity memberRuleSetting){
		memberRuleSettingService.updateById(memberRuleSetting);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:memberrulesetting:delete")
    public R delete(@RequestBody Long[] ids){
		memberRuleSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
