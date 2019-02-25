package com.eureka.consumer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/testController")
public class TestController {
	@Autowired
	private RestTemplate restTemplate;
	@PostMapping("/searchByPage")
    @ResponseBody
    public Map<String, Object> searchPage(){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result",restTemplate.postForEntity("http://SINGLESERVICE/singleservice/employeeController/searchByPage",null ,Map.class).getBody());
        return result;
    }
}
