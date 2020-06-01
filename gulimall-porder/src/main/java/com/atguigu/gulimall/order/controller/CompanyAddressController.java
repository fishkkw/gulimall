package com.atguigu.gulimall.order.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.order.entity.CompanyAddressEntity;
import com.atguigu.gulimall.order.service.CompanyAddressService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 公司收发货地址表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:33:17
 */
@RestController
@RequestMapping("order/companyaddress")
public class CompanyAddressController {
    @Autowired
    private CompanyAddressService companyAddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:companyaddress:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = companyAddressService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:companyaddress:info")
    public R info(@PathVariable("id") Long id){
		CompanyAddressEntity companyAddress = companyAddressService.getById(id);

        return R.ok().put("companyAddress", companyAddress);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:companyaddress:save")
    public R save(@RequestBody CompanyAddressEntity companyAddress){
		companyAddressService.save(companyAddress);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:companyaddress:update")
    public R update(@RequestBody CompanyAddressEntity companyAddress){
		companyAddressService.updateById(companyAddress);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:companyaddress:delete")
    public R delete(@RequestBody Long[] ids){
		companyAddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
