package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.HomeRecommendProductDao;
import com.atguigu.gulimall.coupon.entity.HomeRecommendProductEntity;
import com.atguigu.gulimall.coupon.service.HomeRecommendProductService;


@Service
public class HomeRecommendProductServiceImpl extends ServiceImpl<HomeRecommendProductDao, HomeRecommendProductEntity> implements HomeRecommendProductService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeRecommendProductEntity> page = this.page(
                new Query<HomeRecommendProductEntity>().getPage(params),
                new QueryWrapper<HomeRecommendProductEntity>()
        );

        return new PageUtils(page);
    }

}