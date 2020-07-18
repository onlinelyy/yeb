package com.xxxx.yeb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.yeb.mapper.MenuMapper;
import com.xxxx.yeb.pojo.Admin;
import com.xxxx.yeb.pojo.Menu;
import com.xxxx.yeb.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2020-07-17
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

	@Autowired
	private MenuMapper menuMapper;

	/**
	 * 根据用户id查询菜单
	 * @return
	 */
	@Override
	public List<Menu> getMenusByAdminId() {
		return menuMapper.getMenusByAdminId(((Admin)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
	}

	/**
	 * 查询菜单角色
	 * @return
	 */
	@Override
	public List<Menu> getMenusWithRole() {
		return menuMapper.getMenusWithRole();
	}
}
