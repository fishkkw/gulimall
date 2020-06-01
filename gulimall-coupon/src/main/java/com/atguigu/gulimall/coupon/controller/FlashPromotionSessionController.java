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

import com.atguigu.gulimall.coupon.entity.FlashPromotionSessionEntity;
import com.atguigu.gulimall.coupon.service.FlashPromotionSessionService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 限时购场次表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/flashpromotionsession")
public class FlashPromotionSessionController {
    @Autowired
    private FlashPromotionSessionService flashPromotionSessionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:flashpromotionsession:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionSessionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:flashpromotionsession:info")
    public R info(@PathVariable("id") Long id){
		FlashPromotionSessionEntity flashPromotionSession = flashPromotionSessionService.getById(id);

        return R.ok().put("flashPromotionSession", flashPromotionSession);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:flashpromotionsession:save")
    public R save(@RequestBody FlashPromotionSessionEntity flashPromotionSession){
		flashPromotionSessionService.save(flashPromotionSession);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:flashpromotionsession:update")
    public R update(@RequestBody FlashPromotionSessionEntity flashPromotionSession){
		flashPromotionSessionService.updateById(flashPromotionSession);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:flashpromotionsession:delete")
    public R delete(@RequestBody Long[] ids){
		flashPromotionSessionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
