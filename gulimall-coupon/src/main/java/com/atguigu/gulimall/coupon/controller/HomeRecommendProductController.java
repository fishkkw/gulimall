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

import com.atguigu.gulimall.coupon.entity.HomeRecommendProductEntity;
import com.atguigu.gulimall.coupon.service.HomeRecommendProductService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 人气推荐商品表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/homerecommendproduct")
public class HomeRecommendProductController {
    @Autowired
    private HomeRecommendProductService homeRecommendProductService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:homerecommendproduct:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeRecommendProductService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:homerecommendproduct:info")
    public R info(@PathVariable("id") Long id){
		HomeRecommendProductEntity homeRecommendProduct = homeRecommendProductService.getById(id);

        return R.ok().put("homeRecommendProduct", homeRecommendProduct);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:homerecommendproduct:save")
    public R save(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.save(homeRecommendProduct);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:homerecommendproduct:update")
    public R update(@RequestBody HomeRecommendProductEntity homeRecommendProduct){
		homeRecommendProductService.updateById(homeRecommendProduct);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:homerecommendproduct:delete")
    public R delete(@RequestBody Long[] ids){
		homeRecommendProductService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
