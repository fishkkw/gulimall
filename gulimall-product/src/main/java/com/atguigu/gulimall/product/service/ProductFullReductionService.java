package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.ProductFullReductionEntity;

import java.util.Map;

/**
 * 产品满减表(只针对同商品)
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
public interface ProductFullReductionService extends IService<ProductFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

