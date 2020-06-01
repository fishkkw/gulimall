package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeRecommendProductEntity;

import java.util.Map;

/**
 * 人气推荐商品表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
public interface HomeRecommendProductService extends IService<HomeRecommendProductEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

