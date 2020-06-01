package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sku销售属性值
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 库存单元id
	 */
	private Long skuId;
	/**
	 * 销售属性id（冗余)
	 */
	private Long saleAttrId;
	/**
	 * 销售属性值id
	 */
	private Long saleAttrValueId;
	/**
	 * 销售属性名称(冗余)
	 */
	private String saleAttrName;
	/**
	 * 销售属性值名称(冗余)
	 */
	private String saleAttrValueName;

}
