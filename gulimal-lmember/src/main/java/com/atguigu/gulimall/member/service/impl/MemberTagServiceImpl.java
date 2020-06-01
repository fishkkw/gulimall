package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.member.dao.MemberTagDao;
import com.atguigu.gulimall.member.entity.MemberTagEntity;
import com.atguigu.gulimall.member.service.MemberTagService;


@Service("memberTagService")
public class MemberTagServiceImpl extends ServiceImpl<MemberTagDao, MemberTagEntity> implements MemberTagService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberTagEntity> page = this.page(
                new Query<MemberTagEntity>().getPage(params),
                new QueryWrapper<MemberTagEntity>()
        );

        return new PageUtils(page);
    }

}