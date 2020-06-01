package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.RolePermissionRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户角色和权限关系表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@Mapper
public interface RolePermissionRelationDao extends BaseMapper<RolePermissionRelationEntity> {
	
}
