package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SkuImageEntity;

import java.util.Map;

/**
 * 库存单元图片表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
public interface SkuImageService extends IService<SkuImageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

