package com.atguigu.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.coupon.entity.HomeAdvertiseEntity;
import com.atguigu.gulimall.coupon.service.HomeAdvertiseService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 首页轮播广告表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/homeadvertise")
public class HomeAdvertiseController {
    @Autowired
    private HomeAdvertiseService homeAdvertiseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:homeadvertise:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeAdvertiseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:homeadvertise:info")
    public R info(@PathVariable("id") Long id){
		HomeAdvertiseEntity homeAdvertise = homeAdvertiseService.getById(id);

        return R.ok().put("homeAdvertise", homeAdvertise);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:homeadvertise:save")
    public R save(@RequestBody HomeAdvertiseEntity homeAdvertise){
		homeAdvertiseService.save(homeAdvertise);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:homeadvertise:update")
    public R update(@RequestBody HomeAdvertiseEntity homeAdvertise){
		homeAdvertiseService.updateById(homeAdvertise);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:homeadvertise:delete")
    public R delete(@RequestBody Long[] ids){
		homeAdvertiseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
