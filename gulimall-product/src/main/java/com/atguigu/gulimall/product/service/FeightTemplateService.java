package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.FeightTemplateEntity;

import java.util.Map;

/**
 * 运费模版
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

