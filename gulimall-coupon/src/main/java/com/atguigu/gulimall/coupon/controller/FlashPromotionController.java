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

import com.atguigu.gulimall.coupon.entity.FlashPromotionEntity;
import com.atguigu.gulimall.coupon.service.FlashPromotionService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 限时购表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/flashpromotion")
public class FlashPromotionController {
    @Autowired
    private FlashPromotionService flashPromotionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:flashpromotion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:flashpromotion:info")
    public R info(@PathVariable("id") Long id){
		FlashPromotionEntity flashPromotion = flashPromotionService.getById(id);

        return R.ok().put("flashPromotion", flashPromotion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:flashpromotion:save")
    public R save(@RequestBody FlashPromotionEntity flashPromotion){
		flashPromotionService.save(flashPromotion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:flashpromotion:update")
    public R update(@RequestBody FlashPromotionEntity flashPromotion){
		flashPromotionService.updateById(flashPromotion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:flashpromotion:delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
