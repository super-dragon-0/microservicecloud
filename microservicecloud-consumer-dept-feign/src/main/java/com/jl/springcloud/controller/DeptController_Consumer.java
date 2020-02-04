package com.jl.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jl.springcloud.entities.Dept;
import com.jl.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	
	@Autowired
	private DeptClientService service;
	
	@RequestMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return service.add(dept);
	}
	
	@RequestMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping("/consumer/dept/list")
	public List<Dept> list() {
		return service.list();
	}

}
