package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.FlashPromotionEntity;

import java.util.Map;

/**
 * 限时购表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
public interface FlashPromotionService extends IService<FlashPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

