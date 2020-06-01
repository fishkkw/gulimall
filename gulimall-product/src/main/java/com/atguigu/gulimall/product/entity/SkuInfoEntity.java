package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存单元表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 库存id(itemID)
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long productId;
	/**
	 * 价格
	 */
	private Double price;
	/**
	 * sku名称
	 */
	private String skuName;
	/**
	 * 商品规格描述
	 */
	private String skuDesc;
	/**
	 * 
	 */
	private Double weight;
	/**
	 * 品牌(冗余)
	 */
	private Long tmId;
	/**
	 * 三级分类id（冗余)
	 */
	private Long catalog3Id;
	/**
	 * 默认显示图片(冗余)
	 */
	private String skuDefaultImg;

}
