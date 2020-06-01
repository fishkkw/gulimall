package com.atguigu.gulimall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.order.dao.CompanyAddressDao;
import com.atguigu.gulimall.order.entity.CompanyAddressEntity;
import com.atguigu.gulimall.order.service.CompanyAddressService;


@Service("companyAddressService")
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressDao, CompanyAddressEntity> implements CompanyAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CompanyAddressEntity> page = this.page(
                new Query<CompanyAddressEntity>().getPage(params),
                new QueryWrapper<CompanyAddressEntity>()
        );

        return new PageUtils(page);
    }

}