package com.xxxx.yeb.controller;

import com.xxxx.yeb.pojo.Admin;
import com.xxxx.yeb.pojo.AdminLoginParam;
import com.xxxx.yeb.pojo.RespBean;
import com.xxxx.yeb.service.IAdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 登录
 *
 * @author zhoubin
 * @since 1.0.0
 */
@RestController
public class LoginController {

	@Autowired
	private IAdminService adminService;


	@ApiOperation(value = "登录成功返回token")
	@PostMapping("/login")
	public RespBean login(@RequestBody AdminLoginParam adminLoginParam) {
		return adminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword());
	}


	@ApiOperation(value = "获取当前登录用户信息")
	@GetMapping("/admin/info")
	public Admin getAdminInfo(Principal principal) {
		if (null == principal) {
			return null;
		}
		Admin admin = adminService.getAdminByUserName(principal.getName());
		admin.setPassword(null);
		admin.setRoles(adminService.getRoles(admin.getId()));
		return admin;
	}


	@ApiOperation(value = "退出登录")
	@PostMapping("/logout")
	public RespBean logout() {
		return RespBean.success("退出登录");
	}

}