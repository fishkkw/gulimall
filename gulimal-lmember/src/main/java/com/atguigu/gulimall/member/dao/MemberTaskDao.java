package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员任务表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@Mapper
public interface MemberTaskDao extends BaseMapper<MemberTaskEntity> {
	
}
