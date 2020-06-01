package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeRecommendSubjectEntity;

import java.util.Map;

/**
 * 首页推荐专题表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
public interface HomeRecommendSubjectService extends IService<HomeRecommendSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

