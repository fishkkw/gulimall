package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.ProductFullReductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品满减表(只针对同商品)
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Mapper
public interface ProductFullReductionDao extends BaseMapper<ProductFullReductionEntity> {
	
}
