package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.ProductSaleAttrValueDao;
import com.atguigu.gulimall.product.entity.ProductSaleAttrValueEntity;
import com.atguigu.gulimall.product.service.ProductSaleAttrValueService;


@Service("productSaleAttrValueService")
public class ProductSaleAttrValueServiceImpl extends ServiceImpl<ProductSaleAttrValueDao, ProductSaleAttrValueEntity> implements ProductSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductSaleAttrValueEntity> page = this.page(
                new Query<ProductSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<ProductSaleAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}