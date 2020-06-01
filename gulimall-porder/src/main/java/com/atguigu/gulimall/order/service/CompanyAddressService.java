package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.CompanyAddressEntity;

import java.util.Map;

/**
 * 公司收发货地址表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:33:17
 */
public interface CompanyAddressService extends IService<CompanyAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

