package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠卷表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
