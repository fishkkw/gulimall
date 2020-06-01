package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.FlashPromotionProductRelationEntity;

import java.util.Map;

/**
 * 商品限时购与商品关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
public interface FlashPromotionProductRelationService extends IService<FlashPromotionProductRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

