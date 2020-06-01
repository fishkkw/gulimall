package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.CartItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 购物车表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:33:17
 */
@Mapper
public interface CartItemDao extends BaseMapper<CartItemEntity> {
	
}
