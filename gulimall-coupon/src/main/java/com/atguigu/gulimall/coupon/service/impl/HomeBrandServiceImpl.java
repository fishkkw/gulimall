package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.HomeBrandDao;
import com.atguigu.gulimall.coupon.entity.HomeBrandEntity;
import com.atguigu.gulimall.coupon.service.HomeBrandService;


@Service
public class HomeBrandServiceImpl extends ServiceImpl<HomeBrandDao, HomeBrandEntity> implements HomeBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeBrandEntity> page = this.page(
                new Query<HomeBrandEntity>().getPage(params),
                new QueryWrapper<HomeBrandEntity>()
        );

        return new PageUtils(page);
    }

}