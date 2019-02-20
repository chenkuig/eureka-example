package com.singleservice.service;

import com.singleservice.bean.Employee;

import java.util.List;

/**
 * @Auther: chenkui
 * @Date: 2019/2/19 09:43
 * @Description:
 */
public interface EmployeeService {
    /**
     * 分页查询员工信息数据
     * @return 员工信息
     */
    List<Employee> searcheByPage();
}
