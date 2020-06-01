package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.HomeNewProductDao;
import com.atguigu.gulimall.coupon.entity.HomeNewProductEntity;
import com.atguigu.gulimall.coupon.service.HomeNewProductService;


@Service
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductDao, HomeNewProductEntity> implements HomeNewProductService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeNewProductEntity> page = this.page(
                new Query<HomeNewProductEntity>().getPage(params),
                new QueryWrapper<HomeNewProductEntity>()
        );

        return new PageUtils(page);
    }

}