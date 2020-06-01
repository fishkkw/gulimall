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
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * sku名称
	 */
	private String skuName;
	/**
	 * 购买个数
	 */
	private Integer skuNums;
	/**
	 * 工作单编号
	 */
	private Long taskId;
	/**
	 * 
	 */
	private Integer skuNum;

}
