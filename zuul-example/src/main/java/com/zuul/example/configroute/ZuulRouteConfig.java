package com.zuul.example.configroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
@Configuration*/
public class ZuulRouteConfig {
	@Autowired  
	private  ZuulProperties zuulProperties;  
    @Autowired  
    private ServerProperties server;
    @Bean  
    public ZuulRouteLocator routeLocator() {  
    	ZuulRouteLocator routeLocator = new ZuulRouteLocator("", this.zuulProperties);  
        return routeLocator;  
    }
}
