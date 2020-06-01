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

import com.atguigu.gulimall.member.entity.AdminLoginLogEntity;
import com.atguigu.gulimall.member.service.AdminLoginLogService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 后台用户登录日志表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/adminloginlog")
public class AdminLoginLogController {
    @Autowired
    private AdminLoginLogService adminLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:adminloginlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adminLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:adminloginlog:info")
    public R info(@PathVariable("id") Long id){
		AdminLoginLogEntity adminLoginLog = adminLoginLogService.getById(id);

        return R.ok().put("adminLoginLog", adminLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:adminloginlog:save")
    public R save(@RequestBody AdminLoginLogEntity adminLoginLog){
		adminLoginLogService.save(adminLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:adminloginlog:update")
    public R update(@RequestBody AdminLoginLogEntity adminLoginLog){
		adminLoginLogService.updateById(adminLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:adminloginlog:delete")
    public R delete(@RequestBody Long[] ids){
		adminLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
