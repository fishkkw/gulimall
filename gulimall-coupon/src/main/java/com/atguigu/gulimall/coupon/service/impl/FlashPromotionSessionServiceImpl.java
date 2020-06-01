package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.FlashPromotionSessionDao;
import com.atguigu.gulimall.coupon.entity.FlashPromotionSessionEntity;
import com.atguigu.gulimall.coupon.service.FlashPromotionSessionService;


@Service
public class FlashPromotionSessionServiceImpl extends ServiceImpl<FlashPromotionSessionDao, FlashPromotionSessionEntity> implements FlashPromotionSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionSessionEntity> page = this.page(
                new Query<FlashPromotionSessionEntity>().getPage(params),
                new QueryWrapper<FlashPromotionSessionEntity>()
        );

        return new PageUtils(page);
    }

}