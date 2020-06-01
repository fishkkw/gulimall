package com.atguigu.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.member.entity.MemberProductCategoryRelationEntity;
import com.atguigu.gulimall.member.service.MemberProductCategoryRelationService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 会员与产品分类关系表（用户喜欢的分类）
 *
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@RestController
@RequestMapping("member/memberproductcategoryrelation")
public class MemberProductCategoryRelationController {
    @Autowired
    private MemberProductCategoryRelationService memberProductCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:memberproductcategoryrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberProductCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:memberproductcategoryrelation:info")
    public R info(@PathVariable("id") Long id){
		MemberProductCategoryRelationEntity memberProductCategoryRelation = memberProductCategoryRelationService.getById(id);

        return R.ok().put("memberProductCategoryRelation", memberProductCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:memberproductcategoryrelation:save")
    public R save(@RequestBody MemberProductCategoryRelationEntity memberProductCategoryRelation){
		memberProductCategoryRelationService.save(memberProductCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:memberproductcategoryrelation:update")
    public R update(@RequestBody MemberProductCategoryRelationEntity memberProductCategoryRelation){
		memberProductCategoryRelationService.updateById(memberProductCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:memberproductcategoryrelation:delete")
    public R delete(@RequestBody Long[] ids){
		memberProductCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
