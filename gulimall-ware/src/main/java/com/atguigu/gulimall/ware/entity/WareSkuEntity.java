package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:40:12
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * skuid
	 */
	private Long skuId;
	/**
	 * 仓库id
	 */
	private Long warehouseId;
	/**
	 * 库存数
	 */
	private Integer stock;
	/**
	 * 存货名称
	 */
	private String stockName;
	/**
	 * 
	 */
	private Integer stockLocked;

}
