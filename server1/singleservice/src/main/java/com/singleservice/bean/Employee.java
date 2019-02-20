package com.singleservice.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: chenkui
 * @Date: 2019/2/19 09:28
 * @Description:
 */
@Data
public class Employee implements Serializable {
    /**
     * version
     */
    private static final long serialVersionUID = 1L;
    private String name ;
    private String sno;
    private String sex;
    private String phone;
    private String department;
}
