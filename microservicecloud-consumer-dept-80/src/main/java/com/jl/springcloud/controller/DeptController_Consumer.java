package com.jl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jl.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
	private static final String REST_URL_PREFIX = "http://localhost:8001";
	
	/**
	 * 使用RestTemplate访问RestFul接口
	 * (url,requestMap,ResponseBean.class)这三个参数分别代表
	 * Rest请求地址、请求参数、Http响应被转换的对象类型
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}

}
