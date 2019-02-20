package com.singleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages={"com.singleservice.dao"})
@EnableEurekaClient
public class SingleserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleserviceApplication.class, args);
    }

}
