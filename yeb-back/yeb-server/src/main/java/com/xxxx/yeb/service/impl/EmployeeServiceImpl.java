package com.xxxx.yeb.service.impl;

import com.xxxx.yeb.pojo.Employee;
import com.xxxx.yeb.mapper.EmployeeMapper;
import com.xxxx.yeb.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2020-07-17
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
