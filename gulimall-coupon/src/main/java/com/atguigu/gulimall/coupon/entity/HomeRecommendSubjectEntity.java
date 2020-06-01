package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页推荐专题表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-05-31 21:59:58
 */
@Data
@TableName("sms_home_recommend_subject")
public class HomeRecommendSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long subjectId;
	/**
	 * 
	 */
	private String subjectName;
	/**
	 * 
	 */
	private Integer recommendStatus;
	/**
	 * 
	 */
	private Integer sort;

}
