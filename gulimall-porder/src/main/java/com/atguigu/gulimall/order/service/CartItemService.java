package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.CartItemEntity;

import java.util.Map;

/**
 * 购物车表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:33:17
 */
public interface CartItemService extends IService<CartItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

