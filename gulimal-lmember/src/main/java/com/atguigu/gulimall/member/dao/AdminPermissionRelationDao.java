package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.AdminPermissionRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@Mapper
public interface AdminPermissionRelationDao extends BaseMapper<AdminPermissionRelationEntity> {
	
}
