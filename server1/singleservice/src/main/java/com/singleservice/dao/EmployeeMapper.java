package com.singleservice.dao;

import com.github.pagehelper.Page;
import com.singleservice.BasicMapper;
import com.singleservice.bean.Employee;

/**
 * @Auther: chenkui
 * @Date: 2019/2/19 09:35
 * @Description:
 */
public interface  EmployeeMapper extends BasicMapper<Employee>{
    Page<Employee> searchPage();
}
