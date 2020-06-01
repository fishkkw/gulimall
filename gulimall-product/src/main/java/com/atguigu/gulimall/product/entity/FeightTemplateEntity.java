package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 运费模版
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:41:39
 */
@Data
@TableName("pms_feight_template")
public class FeightTemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String name;
	/**
	 * 计费类型:0->按重量；1->按件数
	 */
	private Integer chargeType;
	/**
	 * 首重kg
	 */
	private BigDecimal firstWeight;
	/**
	 * 首费（元）
	 */
	private BigDecimal firstFee;
	/**
	 * 
	 */
	private BigDecimal continueWeight;
	/**
	 * 
	 */
	private BigDecimal continmeFee;
	/**
	 * 目的地（省、市）
	 */
	private String dest;

}
