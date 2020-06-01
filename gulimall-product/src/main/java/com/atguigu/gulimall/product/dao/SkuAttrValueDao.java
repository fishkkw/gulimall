package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.SkuAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku平台属性值关联表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Mapper
public interface SkuAttrValueDao extends BaseMapper<SkuAttrValueEntity> {
	
}
