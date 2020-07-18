package com.xxxx.yeb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.yeb.pojo.Admin;
import com.xxxx.yeb.pojo.RespBean;
import com.xxxx.yeb.pojo.Role;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2020-07-17
 */
public interface IAdminService extends IService<Admin> {

	/**
	 * 登录成功返回token
	 * @param username
	 * @param password
	 * @return
	 */
	RespBean login(String username, String password);


	/**
	 * 根据用户名获取用户
	 * @param username
	 * @return
	 */
	Admin getAdminByUserName(String username);

	/**
	 * 根据用户获取角色列表
	 * @param adminId
	 * @return
	 */
	List<Role> getRoles(Integer adminId);
}
