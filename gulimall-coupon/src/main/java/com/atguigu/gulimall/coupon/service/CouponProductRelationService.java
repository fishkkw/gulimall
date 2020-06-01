package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.CouponProductRelationEntity;

import java.util.Map;

/**
 * 优惠券和产品的关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
public interface CouponProductRelationService extends IService<CouponProductRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

