package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.member.dao.MemberProductCategoryRelationDao;
import com.atguigu.gulimall.member.entity.MemberProductCategoryRelationEntity;
import com.atguigu.gulimall.member.service.MemberProductCategoryRelationService;


@Service("memberProductCategoryRelationService")
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationDao, MemberProductCategoryRelationEntity> implements MemberProductCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberProductCategoryRelationEntity> page = this.page(
                new Query<MemberProductCategoryRelationEntity>().getPage(params),
                new QueryWrapper<MemberProductCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}