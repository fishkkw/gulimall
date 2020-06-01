package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.AdminPermissionRelationEntity;

import java.util.Map;

/**
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
public interface AdminPermissionRelationService extends IService<AdminPermissionRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

