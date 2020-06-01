package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.CouponProductCategoryRelationDao;
import com.atguigu.gulimall.coupon.entity.CouponProductCategoryRelationEntity;
import com.atguigu.gulimall.coupon.service.CouponProductCategoryRelationService;


@Service
public class CouponProductCategoryRelationServiceImpl extends ServiceImpl<CouponProductCategoryRelationDao, CouponProductCategoryRelationEntity> implements CouponProductCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponProductCategoryRelationEntity> page = this.page(
                new Query<CouponProductCategoryRelationEntity>().getPage(params),
                new QueryWrapper<CouponProductCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}