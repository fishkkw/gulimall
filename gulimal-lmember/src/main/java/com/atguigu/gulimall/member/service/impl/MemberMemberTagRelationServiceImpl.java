package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.member.dao.MemberMemberTagRelationDao;
import com.atguigu.gulimall.member.entity.MemberMemberTagRelationEntity;
import com.atguigu.gulimall.member.service.MemberMemberTagRelationService;


@Service("memberMemberTagRelationService")
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationDao, MemberMemberTagRelationEntity> implements MemberMemberTagRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberMemberTagRelationEntity> page = this.page(
                new Query<MemberMemberTagRelationEntity>().getPage(params),
                new QueryWrapper<MemberMemberTagRelationEntity>()
        );

        return new PageUtils(page);
    }

}