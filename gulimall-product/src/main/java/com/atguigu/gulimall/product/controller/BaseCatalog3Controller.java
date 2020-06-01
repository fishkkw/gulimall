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

import com.atguigu.gulimall.product.entity.BaseCatalog3Entity;
import com.atguigu.gulimall.product.service.BaseCatalog3Service;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@RestController
@RequestMapping("product/basecatalog3")
public class BaseCatalog3Controller {
    @Autowired
    private BaseCatalog3Service baseCatalog3Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:basecatalog3:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseCatalog3Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:basecatalog3:info")
    public R info(@PathVariable("id") Long id){
		BaseCatalog3Entity baseCatalog3 = baseCatalog3Service.getById(id);

        return R.ok().put("baseCatalog3", baseCatalog3);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:basecatalog3:save")
    public R save(@RequestBody BaseCatalog3Entity baseCatalog3){
		baseCatalog3Service.save(baseCatalog3);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:basecatalog3:update")
    public R update(@RequestBody BaseCatalog3Entity baseCatalog3){
		baseCatalog3Service.updateById(baseCatalog3);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:basecatalog3:delete")
    public R delete(@RequestBody Long[] ids){
		baseCatalog3Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
