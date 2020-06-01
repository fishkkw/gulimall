package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberRuleSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员积分成长规则表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@Mapper
public interface MemberRuleSettingDao extends BaseMapper<MemberRuleSettingEntity> {
	
}