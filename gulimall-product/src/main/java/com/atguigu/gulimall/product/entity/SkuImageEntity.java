package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存单元图片表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Data
@TableName("pms_sku_image")
public class SkuImageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 商品id
	 */
	private Long skuId;
	/**
	 * 图片名称（冗余）
	 */
	private String imgName;
	/**
	 * 图片路径(冗余)
	 */
	private String imgUrl;
	/**
	 * 商品图片id
	 */
	private Long productImgId;
	/**
	 * 是否默认
	 */
	private String isDefault;

}
