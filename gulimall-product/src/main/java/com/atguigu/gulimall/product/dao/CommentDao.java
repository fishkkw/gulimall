package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
