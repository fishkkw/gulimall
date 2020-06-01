package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 人气推荐商品表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@Data
@TableName("sms_home_recommend_product")
public class HomeRecommendProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long productId;
	/**
	 * 
	 */
	private String productName;
	/**
	 * 
	 */
	private Integer recommendStatus;
	/**
	 * 
	 */
	private Integer sort;

}
