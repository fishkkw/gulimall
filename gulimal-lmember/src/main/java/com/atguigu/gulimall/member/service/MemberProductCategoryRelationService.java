package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberProductCategoryRelationEntity;

import java.util.Map;

/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
public interface MemberProductCategoryRelationService extends IService<MemberProductCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

