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

import com.atguigu.gulimall.product.entity.BaseAttrValueEntity;
import com.atguigu.gulimall.product.service.BaseAttrValueService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 属性值表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@RestController
@RequestMapping("product/baseattrvalue")
public class BaseAttrValueController {
    @Autowired
    private BaseAttrValueService baseAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:baseattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = baseAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:baseattrvalue:info")
    public R info(@PathVariable("id") Long id){
		BaseAttrValueEntity baseAttrValue = baseAttrValueService.getById(id);

        return R.ok().put("baseAttrValue", baseAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:baseattrvalue:save")
    public R save(@RequestBody BaseAttrValueEntity baseAttrValue){
		baseAttrValueService.save(baseAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:baseattrvalue:update")
    public R update(@RequestBody BaseAttrValueEntity baseAttrValue){
		baseAttrValueService.updateById(baseAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:baseattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		baseAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
