package com.xxxx.yeb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.yeb.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2020-07-17
 */
public interface IMenuService extends IService<Menu> {

	/**
	 * 根据用户id查询菜单
	 * @return
	 */
	List<Menu> getMenusByAdminId();


	/**
	 * 查询菜单角色
	 * @return
	 */
	List<Menu> getMenusWithRole();
}
