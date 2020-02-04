package com.jl.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jl.springcloud.entities.Dept;
import com.jl.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;
	
	@GetMapping("/dept/get/{id}")
	//一旦调用服务方法失败并抛出了异常信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中指定的
	@HystrixCommand(fallbackMethod="processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = service.get(id);
		if(null == dept) {
			throw new RuntimeException("该ID"+id+"没有对应的信息"); 
		}
		return dept;
	}

	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("该ID"+id+"没有对应的信息@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}
}
