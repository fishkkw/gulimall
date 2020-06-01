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

import com.atguigu.gulimall.coupon.entity.CouponProductRelationEntity;
import com.atguigu.gulimall.coupon.service.CouponProductRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 优惠券和产品的关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/couponproductrelation")
public class CouponProductRelationController {
    @Autowired
    private CouponProductRelationService couponProductRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:couponproductrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponProductRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:couponproductrelation:info")
    public R info(@PathVariable("id") Long id){
		CouponProductRelationEntity couponProductRelation = couponProductRelationService.getById(id);

        return R.ok().put("couponProductRelation", couponProductRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:couponproductrelation:save")
    public R save(@RequestBody CouponProductRelationEntity couponProductRelation){
		couponProductRelationService.save(couponProductRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:couponproductrelation:update")
    public R update(@RequestBody CouponProductRelationEntity couponProductRelation){
		couponProductRelationService.updateById(couponProductRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:couponproductrelation:delete")
    public R delete(@RequestBody Long[] ids){
		couponProductRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
