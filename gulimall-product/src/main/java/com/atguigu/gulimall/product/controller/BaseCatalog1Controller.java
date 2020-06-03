package com.atguigu.gulimall.product.controller;

import java.util.*;
import java.util.stream.Collectors;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.atguigu.gulimall.product.entity.BaseCatalog2Entity;
import com.atguigu.gulimall.product.entity.BaseCatalog3Entity;
import com.atguigu.gulimall.product.service.BaseCatalog2Service;
import com.atguigu.gulimall.product.service.BaseCatalog3Service;
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

    @Autowired
    private BaseCatalog2Service baseCatalog2Service;

    @Autowired
    private BaseCatalog3Service baseCatalog3Service;
    /**
     * 列表
     */
    @RequestMapping("/list/tree")
    //@RequiresPermissions("product:basecatalog1:list")
    public R list() {
        List<BaseCatalog1Entity> baseCatalog1s = baseCatalog1Service.list();
        List<BaseCatalog2Entity> baseCatalog2s = baseCatalog2Service.list();
        List<BaseCatalog3Entity> baseCatalog3s = baseCatalog3Service.list();


        List<JSONObject> jsonObjects = baseCatalog1s.stream().map(baseCatalog1Entity -> {
            JSONObject json = new JSONObject();
            json.put("id", baseCatalog1Entity.getId());
            json.put("name", baseCatalog1Entity.getName());
            json.put("child", baseCatalog2s.stream().filter(baseCatalog2Entity ->
                    baseCatalog2Entity.getCatalog1Id() == baseCatalog1Entity.getId()).map(
                    baseCatalog2Entity -> {
                        JSONObject jsonObject = new JSONObject();
                        jsonObject.put("id", baseCatalog2Entity.getId());
                        jsonObject.put("name", baseCatalog2Entity.getName());
                        jsonObject.put("child", baseCatalog3s.stream().filter(baseCatalog3Entity ->
                                baseCatalog3Entity.getCatalog2Id() == Long.valueOf(baseCatalog2Entity.getId()))
                                .map(baseCatalog3Entity ->
                                        {
                                            JSONObject jsonObject2 = new JSONObject();
                                            jsonObject2.put("id", baseCatalog3Entity.getId());
                                            jsonObject2.put("name", baseCatalog3Entity.getName());
                                            return jsonObject2;
                                        }
                                ).collect(Collectors.toList()));
                        jsonObject.put("catalog1Id", baseCatalog2Entity.getCatalog1Id());
                        return jsonObject;
                    }
            ).collect(Collectors.toList()));
            return json;
        }).collect(Collectors.toList());
        return R.ok().put("baseCata", jsonObjects);
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
