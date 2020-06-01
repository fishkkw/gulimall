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

import com.atguigu.gulimall.product.entity.ProductVertifyRecordEntity;
import com.atguigu.gulimall.product.service.ProductVertifyRecordService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 商品审核记录
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@RestController
@RequestMapping("product/productvertifyrecord")
public class ProductVertifyRecordController {
    @Autowired
    private ProductVertifyRecordService productVertifyRecordService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:productvertifyrecord:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productVertifyRecordService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:productvertifyrecord:info")
    public R info(@PathVariable("id") Long id){
		ProductVertifyRecordEntity productVertifyRecord = productVertifyRecordService.getById(id);

        return R.ok().put("productVertifyRecord", productVertifyRecord);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:productvertifyrecord:save")
    public R save(@RequestBody ProductVertifyRecordEntity productVertifyRecord){
		productVertifyRecordService.save(productVertifyRecord);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:productvertifyrecord:update")
    public R update(@RequestBody ProductVertifyRecordEntity productVertifyRecord){
		productVertifyRecordService.updateById(productVertifyRecord);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:productvertifyrecord:delete")
    public R delete(@RequestBody Long[] ids){
		productVertifyRecordService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
