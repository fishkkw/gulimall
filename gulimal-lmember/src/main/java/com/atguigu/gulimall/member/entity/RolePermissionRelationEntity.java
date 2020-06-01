package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 后台用户角色和权限关系表
 * 
 * @author wk
 * @email wk@gmail.com
 * @date 2020-06-01 07:27:50
 */
@Data
@TableName("ums_role_permission_relation")
public class RolePermissionRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long roleId;
	/**
	 * 
	 */
	private Long permissionId;

}
