package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberProductCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@Mapper
public interface MemberProductCategoryRelationDao extends BaseMapper<MemberProductCategoryRelationEntity> {
	
}
