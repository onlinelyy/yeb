package com.xxxx.yeb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.yeb.pojo.Role;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zhoubin
 * @since 2020-07-17
 */
public interface RoleMapper extends BaseMapper<Role> {

	/**
	 * 根据用户获取角色列表
	 *
	 * @param adminId
	 * @return
	 */
	List<Role> getRoles(Integer adminId);
}
