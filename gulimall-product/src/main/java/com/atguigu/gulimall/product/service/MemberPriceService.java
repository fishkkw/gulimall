package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

