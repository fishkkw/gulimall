package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.HomeRecommendSubjectDao;
import com.atguigu.gulimall.coupon.entity.HomeRecommendSubjectEntity;
import com.atguigu.gulimall.coupon.service.HomeRecommendSubjectService;


@Service
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectDao, HomeRecommendSubjectEntity> implements HomeRecommendSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeRecommendSubjectEntity> page = this.page(
                new Query<HomeRecommendSubjectEntity>().getPage(params),
                new QueryWrapper<HomeRecommendSubjectEntity>()
        );

        return new PageUtils(page);
    }

}