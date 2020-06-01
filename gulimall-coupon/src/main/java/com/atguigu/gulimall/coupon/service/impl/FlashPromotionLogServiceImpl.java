package com.atguigu.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.coupon.dao.FlashPromotionLogDao;
import com.atguigu.gulimall.coupon.entity.FlashPromotionLogEntity;
import com.atguigu.gulimall.coupon.service.FlashPromotionLogService;


@Service
public class FlashPromotionLogServiceImpl extends ServiceImpl<FlashPromotionLogDao, FlashPromotionLogEntity> implements FlashPromotionLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FlashPromotionLogEntity> page = this.page(
                new Query<FlashPromotionLogEntity>().getPage(params),
                new QueryWrapper<FlashPromotionLogEntity>()
        );

        return new PageUtils(page);
    }

}