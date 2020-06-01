package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeAdvertiseEntity;

import java.util.Map;

/**
 * 首页轮播广告表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
public interface HomeAdvertiseService extends IService<HomeAdvertiseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

