package com.zuul.example.configroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.RoutesRefreshedEvent;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
/*@Component*/
public class ZuulAutoRefresh {
	@Autowired  
    ApplicationEventPublisher publisher;  
  
    @Autowired  
    RouteLocator routeLocator;  
  
    public void refreshRoute() {  
        RoutesRefreshedEvent routesRefreshedEvent = new RoutesRefreshedEvent(routeLocator);  
        publisher.publishEvent(routesRefreshedEvent);  
    }
}
