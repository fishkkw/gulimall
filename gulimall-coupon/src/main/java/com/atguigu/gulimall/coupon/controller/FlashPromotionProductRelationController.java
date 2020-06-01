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

import com.atguigu.gulimall.coupon.entity.FlashPromotionProductRelationEntity;
import com.atguigu.gulimall.coupon.service.FlashPromotionProductRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 商品限时购与商品关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/flashpromotionproductrelation")
public class FlashPromotionProductRelationController {
    @Autowired
    private FlashPromotionProductRelationService flashPromotionProductRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:flashpromotionproductrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionProductRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:flashpromotionproductrelation:info")
    public R info(@PathVariable("id") Long id){
		FlashPromotionProductRelationEntity flashPromotionProductRelation = flashPromotionProductRelationService.getById(id);

        return R.ok().put("flashPromotionProductRelation", flashPromotionProductRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:flashpromotionproductrelation:save")
    public R save(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.save(flashPromotionProductRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:flashpromotionproductrelation:update")
    public R update(@RequestBody FlashPromotionProductRelationEntity flashPromotionProductRelation){
		flashPromotionProductRelationService.updateById(flashPromotionProductRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:flashpromotionproductrelation:delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionProductRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
