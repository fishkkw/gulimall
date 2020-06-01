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

import com.atguigu.gulimall.coupon.entity.HomeNewProductEntity;
import com.atguigu.gulimall.coupon.service.HomeNewProductService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 新鲜好物表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/homenewproduct")
public class HomeNewProductController {
    @Autowired
    private HomeNewProductService homeNewProductService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:homenewproduct:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeNewProductService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:homenewproduct:info")
    public R info(@PathVariable("id") Long id){
		HomeNewProductEntity homeNewProduct = homeNewProductService.getById(id);

        return R.ok().put("homeNewProduct", homeNewProduct);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:homenewproduct:save")
    public R save(@RequestBody HomeNewProductEntity homeNewProduct){
		homeNewProductService.save(homeNewProduct);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:homenewproduct:update")
    public R update(@RequestBody HomeNewProductEntity homeNewProduct){
		homeNewProductService.updateById(homeNewProduct);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:homenewproduct:delete")
    public R delete(@RequestBody Long[] ids){
		homeNewProductService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
