package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.ProductLadderDao;
import com.atguigu.gulimall.product.entity.ProductLadderEntity;
import com.atguigu.gulimall.product.service.ProductLadderService;


@Service("productLadderService")
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderDao, ProductLadderEntity> implements ProductLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductLadderEntity> page = this.page(
                new Query<ProductLadderEntity>().getPage(params),
                new QueryWrapper<ProductLadderEntity>()
        );

        return new PageUtils(page);
    }

}