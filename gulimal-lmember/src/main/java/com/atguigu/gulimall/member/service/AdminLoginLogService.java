package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.AdminLoginLogEntity;

import java.util.Map;

/**
 * 后台用户登录日志表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
public interface AdminLoginLogService extends IService<AdminLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

