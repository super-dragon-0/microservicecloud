package com.jl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient    //eureka客户端
@EnableDiscoveryClient   //服务发现
public class Config_Client_8001_App {

	public static void main(String[] args) {
		SpringApplication.run(Config_Client_8001_App.class, args);
	}
}
