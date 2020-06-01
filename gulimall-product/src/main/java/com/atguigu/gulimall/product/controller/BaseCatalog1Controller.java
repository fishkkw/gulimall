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

import com.atguigu.gulimall.product.entity.BaseCatalog1Entity;
import com.atguigu.gulimall.product.service.BaseCatalog1Service;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 一级分类表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@RestController
@RequestMapping("product/basecatalog1")
public class BaseCatalog1Controller {
    @Autowired
    private BaseCatalog1Service baseCatalog1Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:basecatalog1:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseCatalog1Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:basecatalog1:info")
    public R info(@PathVariable("id") Integer id){
		BaseCatalog1Entity baseCatalog1 = baseCatalog1Service.getById(id);

        return R.ok().put("baseCatalog1", baseCatalog1);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:basecatalog1:save")
    public R save(@RequestBody BaseCatalog1Entity baseCatalog1){
		baseCatalog1Service.save(baseCatalog1);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:basecatalog1:update")
    public R update(@RequestBody BaseCatalog1Entity baseCatalog1){
		baseCatalog1Service.updateById(baseCatalog1);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:basecatalog1:delete")
    public R delete(@RequestBody Integer[] ids){
		baseCatalog1Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
