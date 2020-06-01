package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.ProductLadderEntity;

import java.util.Map;

/**
 * 产品阶梯价格表(只针对同商品)
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
public interface ProductLadderService extends IService<ProductLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

