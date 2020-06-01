package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.member.dao.RolePermissionRelationDao;
import com.atguigu.gulimall.member.entity.RolePermissionRelationEntity;
import com.atguigu.gulimall.member.service.RolePermissionRelationService;


@Service("rolePermissionRelationService")
public class RolePermissionRelationServiceImpl extends ServiceImpl<RolePermissionRelationDao, RolePermissionRelationEntity> implements RolePermissionRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RolePermissionRelationEntity> page = this.page(
                new Query<RolePermissionRelationEntity>().getPage(params),
                new QueryWrapper<RolePermissionRelationEntity>()
        );

        return new PageUtils(page);
    }

}