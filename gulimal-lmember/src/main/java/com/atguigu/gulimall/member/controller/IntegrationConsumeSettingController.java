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

import com.atguigu.gulimall.member.entity.IntegrationConsumeSettingEntity;
import com.atguigu.gulimall.member.service.IntegrationConsumeSettingService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 积分消费设置
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/integrationconsumesetting")
public class IntegrationConsumeSettingController {
    @Autowired
    private IntegrationConsumeSettingService integrationConsumeSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:integrationconsumesetting:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = integrationConsumeSettingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:integrationconsumesetting:info")
    public R info(@PathVariable("id") Long id){
		IntegrationConsumeSettingEntity integrationConsumeSetting = integrationConsumeSettingService.getById(id);

        return R.ok().put("integrationConsumeSetting", integrationConsumeSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:integrationconsumesetting:save")
    public R save(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.save(integrationConsumeSetting);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:integrationconsumesetting:update")
    public R update(@RequestBody IntegrationConsumeSettingEntity integrationConsumeSetting){
		integrationConsumeSettingService.updateById(integrationConsumeSetting);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:integrationconsumesetting:delete")
    public R delete(@RequestBody Long[] ids){
		integrationConsumeSettingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
