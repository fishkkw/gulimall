package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.ProductLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品阶梯价格表(只针对同商品)
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Mapper
public interface ProductLadderDao extends BaseMapper<ProductLadderEntity> {
	
}
