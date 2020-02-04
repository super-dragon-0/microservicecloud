package com.jl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.jl.springcloud.rule.MyselfRule;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MyselfRule.class)  
//自定义ribbon的rule
public class DeptConsumer80_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
