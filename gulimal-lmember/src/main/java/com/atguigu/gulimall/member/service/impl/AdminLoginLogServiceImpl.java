package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.member.dao.AdminLoginLogDao;
import com.atguigu.gulimall.member.entity.AdminLoginLogEntity;
import com.atguigu.gulimall.member.service.AdminLoginLogService;


@Service("adminLoginLogService")
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogDao, AdminLoginLogEntity> implements AdminLoginLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AdminLoginLogEntity> page = this.page(
                new Query<AdminLoginLogEntity>().getPage(params),
                new QueryWrapper<AdminLoginLogEntity>()
        );

        return new PageUtils(page);
    }

}