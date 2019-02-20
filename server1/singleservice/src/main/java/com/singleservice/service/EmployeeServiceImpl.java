package com.singleservice.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.singleservice.bean.Employee;
import com.singleservice.dao.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: chenkui
 * @Date: 2019/2/19 09:45
 * @Description:
 */
@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> searcheByPage() {
        PageHelper.startPage(0,10);
        Page<Employee> page = employeeMapper.searchPage();
        return page.getResult();
    }
}
