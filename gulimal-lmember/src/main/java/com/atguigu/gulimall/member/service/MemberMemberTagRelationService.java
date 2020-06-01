package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberMemberTagRelationEntity;

import java.util.Map;

/**
 * 用户和标签关系表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
public interface MemberMemberTagRelationService extends IService<MemberMemberTagRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

