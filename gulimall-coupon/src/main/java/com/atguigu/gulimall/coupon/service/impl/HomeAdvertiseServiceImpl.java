package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.HomeAdvertiseDao;
import com.atguigu.gulimall.coupon.entity.HomeAdvertiseEntity;
import com.atguigu.gulimall.coupon.service.HomeAdvertiseService;


@Service
public class HomeAdvertiseServiceImpl extends ServiceImpl<HomeAdvertiseDao, HomeAdvertiseEntity> implements HomeAdvertiseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvertiseEntity> page = this.page(
                new Query<HomeAdvertiseEntity>().getPage(params),
                new QueryWrapper<HomeAdvertiseEntity>()
        );

        return new PageUtils(page);
    }

}