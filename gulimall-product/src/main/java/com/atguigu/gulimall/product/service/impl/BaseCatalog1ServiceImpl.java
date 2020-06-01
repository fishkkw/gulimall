package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.BaseCatalog1Dao;
import com.atguigu.gulimall.product.entity.BaseCatalog1Entity;
import com.atguigu.gulimall.product.service.BaseCatalog1Service;


@Service("baseCatalog1Service")
public class BaseCatalog1ServiceImpl extends ServiceImpl<BaseCatalog1Dao, BaseCatalog1Entity> implements BaseCatalog1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BaseCatalog1Entity> page = this.page(
                new Query<BaseCatalog1Entity>().getPage(params),
                new QueryWrapper<BaseCatalog1Entity>()
        );

        return new PageUtils(page);
    }

}