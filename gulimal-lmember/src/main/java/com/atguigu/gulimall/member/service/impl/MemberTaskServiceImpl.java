package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.member.dao.MemberTaskDao;
import com.atguigu.gulimall.member.entity.MemberTaskEntity;
import com.atguigu.gulimall.member.service.MemberTaskService;


@Service("memberTaskService")
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskDao, MemberTaskEntity> implements MemberTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberTaskEntity> page = this.page(
                new Query<MemberTaskEntity>().getPage(params),
                new QueryWrapper<MemberTaskEntity>()
        );

        return new PageUtils(page);
    }

}