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

import com.atguigu.gulimall.coupon.entity.HomeBrandEntity;
import com.atguigu.gulimall.coupon.service.HomeBrandService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 首页推荐品牌表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/homebrand")
public class HomeBrandController {
    @Autowired
    private HomeBrandService homeBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:homebrand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:homebrand:info")
    public R info(@PathVariable("id") Long id){
		HomeBrandEntity homeBrand = homeBrandService.getById(id);

        return R.ok().put("homeBrand", homeBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:homebrand:save")
    public R save(@RequestBody HomeBrandEntity homeBrand){
		homeBrandService.save(homeBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:homebrand:update")
    public R update(@RequestBody HomeBrandEntity homeBrand){
		homeBrandService.updateById(homeBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:homebrand:delete")
    public R delete(@RequestBody Long[] ids){
		homeBrandService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
