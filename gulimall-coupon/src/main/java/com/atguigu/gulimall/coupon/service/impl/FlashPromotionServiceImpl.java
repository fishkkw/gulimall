package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.FlashPromotionDao;
import com.atguigu.gulimall.coupon.entity.FlashPromotionEntity;
import com.atguigu.gulimall.coupon.service.FlashPromotionService;


@Service
public class FlashPromotionServiceImpl extends ServiceImpl<FlashPromotionDao, FlashPromotionEntity> implements FlashPromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionEntity> page = this.page(
                new Query<FlashPromotionEntity>().getPage(params),
                new QueryWrapper<FlashPromotionEntity>()
        );

        return new PageUtils(page);
    }

}