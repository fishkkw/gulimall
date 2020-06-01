package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.ProductVertifyRecordEntity;

import java.util.Map;

/**
 * 商品审核记录
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
public interface ProductVertifyRecordService extends IService<ProductVertifyRecordEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

