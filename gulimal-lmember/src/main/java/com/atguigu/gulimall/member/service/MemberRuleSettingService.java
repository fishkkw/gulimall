package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberRuleSettingEntity;

import java.util.Map;

/**
 * 会员积分成长规则表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
public interface MemberRuleSettingService extends IService<MemberRuleSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

