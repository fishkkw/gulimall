package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.entity.BaseAttrInfoEntity;
import com.atguigu.gulimall.product.service.BaseAttrInfoService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 属性表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@RestController
@RequestMapping("product/baseattrinfo")
public class BaseAttrInfoController {
    @Autowired
    private BaseAttrInfoService baseAttrInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:baseattrinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseAttrInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:baseattrinfo:info")
    public R info(@PathVariable("id") Long id){
		BaseAttrInfoEntity baseAttrInfo = baseAttrInfoService.getById(id);

        return R.ok().put("baseAttrInfo", baseAttrInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:baseattrinfo:save")
    public R save(@RequestBody BaseAttrInfoEntity baseAttrInfo){
		baseAttrInfoService.save(baseAttrInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:baseattrinfo:update")
    public R update(@RequestBody BaseAttrInfoEntity baseAttrInfo){
		baseAttrInfoService.updateById(baseAttrInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:baseattrinfo:delete")
    public R delete(@RequestBody Long[] ids){
		baseAttrInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
