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

import com.atguigu.gulimall.coupon.entity.CouponProductCategoryRelationEntity;
import com.atguigu.gulimall.coupon.service.CouponProductCategoryRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 优惠券和产品分类关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/couponproductcategoryrelation")
public class CouponProductCategoryRelationController {
    @Autowired
    private CouponProductCategoryRelationService couponProductCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:couponproductcategoryrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponProductCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:couponproductcategoryrelation:info")
    public R info(@PathVariable("id") Long id){
		CouponProductCategoryRelationEntity couponProductCategoryRelation = couponProductCategoryRelationService.getById(id);

        return R.ok().put("couponProductCategoryRelation", couponProductCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:couponproductcategoryrelation:save")
    public R save(@RequestBody CouponProductCategoryRelationEntity couponProductCategoryRelation){
		couponProductCategoryRelationService.save(couponProductCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:couponproductcategoryrelation:update")
    public R update(@RequestBody CouponProductCategoryRelationEntity couponProductCategoryRelation){
		couponProductCategoryRelationService.updateById(couponProductCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:couponproductcategoryrelation:delete")
    public R delete(@RequestBody Long[] ids){
		couponProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
