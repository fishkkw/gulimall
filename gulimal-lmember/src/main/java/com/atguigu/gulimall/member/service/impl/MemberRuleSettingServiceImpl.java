package com.atguigu.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.member.dao.MemberRuleSettingDao;
import com.atguigu.gulimall.member.entity.MemberRuleSettingEntity;
import com.atguigu.gulimall.member.service.MemberRuleSettingService;


@Service("memberRuleSettingService")
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingDao, MemberRuleSettingEntity> implements MemberRuleSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberRuleSettingEntity> page = this.page(
                new Query<MemberRuleSettingEntity>().getPage(params),
                new QueryWrapper<MemberRuleSettingEntity>()
        );

        return new PageUtils(page);
    }

}