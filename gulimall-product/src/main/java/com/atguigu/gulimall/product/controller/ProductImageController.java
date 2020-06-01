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

import com.atguigu.gulimall.product.entity.ProductImageEntity;
import com.atguigu.gulimall.product.service.ProductImageService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 商品图片表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@RestController
@RequestMapping("product/productimage")
public class ProductImageController {
    @Autowired
    private ProductImageService productImageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:productimage:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productImageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("product:productimage:info")
    public R info(@PathVariable("id") Long id){
		ProductImageEntity productImage = productImageService.getById(id);

        return R.ok().put("productImage", productImage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:productimage:save")
    public R save(@RequestBody ProductImageEntity productImage){
		productImageService.save(productImage);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:productimage:update")
    public R update(@RequestBody ProductImageEntity productImage){
		productImageService.updateById(productImage);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:productimage:delete")
    public R delete(@RequestBody Long[] ids){
		productImageService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
