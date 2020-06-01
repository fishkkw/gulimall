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

import com.atguigu.gulimall.coupon.entity.FlashPromotionLogEntity;
import com.atguigu.gulimall.coupon.service.FlashPromotionLogService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 限时购通知记录
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/flashpromotionlog")
public class FlashPromotionLogController {
    @Autowired
    private FlashPromotionLogService flashPromotionLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:flashpromotionlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = flashPromotionLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:flashpromotionlog:info")
    public R info(@PathVariable("id") Integer id){
		FlashPromotionLogEntity flashPromotionLog = flashPromotionLogService.getById(id);

        return R.ok().put("flashPromotionLog", flashPromotionLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:flashpromotionlog:save")
    public R save(@RequestBody FlashPromotionLogEntity flashPromotionLog){
		flashPromotionLogService.save(flashPromotionLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:flashpromotionlog:update")
    public R update(@RequestBody FlashPromotionLogEntity flashPromotionLog){
		flashPromotionLogService.updateById(flashPromotionLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:flashpromotionlog:delete")
    public R delete(@RequestBody Integer[] ids){
		flashPromotionLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
