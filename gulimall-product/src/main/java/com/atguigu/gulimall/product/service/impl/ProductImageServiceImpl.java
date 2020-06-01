package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.ProductImageDao;
import com.atguigu.gulimall.product.entity.ProductImageEntity;
import com.atguigu.gulimall.product.service.ProductImageService;


@Service("productImageService")
public class ProductImageServiceImpl extends ServiceImpl<ProductImageDao, ProductImageEntity> implements ProductImageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductImageEntity> page = this.page(
                new Query<ProductImageEntity>().getPage(params),
                new QueryWrapper<ProductImageEntity>()
        );

        return new PageUtils(page);
    }

}