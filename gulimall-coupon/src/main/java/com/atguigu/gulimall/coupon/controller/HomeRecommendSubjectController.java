package com.atguigu.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.coupon.entity.HomeRecommendSubjectEntity;
import com.atguigu.gulimall.coupon.service.HomeRecommendSubjectService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 首页推荐专题表
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@RestController
@RequestMapping("coupon/homerecommendsubject")
public class HomeRecommendSubjectController {
    @Autowired
    private HomeRecommendSubjectService homeRecommendSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:homerecommendsubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = homeRecommendSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:homerecommendsubject:info")
    public R info(@PathVariable("id") Long id){
		HomeRecommendSubjectEntity homeRecommendSubject = homeRecommendSubjectService.getById(id);

        return R.ok().put("homeRecommendSubject", homeRecommendSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:homerecommendsubject:save")
    public R save(@RequestBody HomeRecommendSubjectEntity homeRecommendSubject){
		homeRecommendSubjectService.save(homeRecommendSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:homerecommendsubject:update")
    public R update(@RequestBody HomeRecommendSubjectEntity homeRecommendSubject){
		homeRecommendSubjectService.updateById(homeRecommendSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:homerecommendsubject:delete")
    public R delete(@RequestBody Long[] ids){
		homeRecommendSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
