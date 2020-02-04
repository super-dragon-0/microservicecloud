package com.jl.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced  //spring cloud ribbon是基于Netlix实现的一套客户端  负载均衡工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule getRule() {
		//return new RoundRobbinRule();   //轮询算法
		//return new RandomRule();  //随机算法
		return new RetryRule();  //重试算法
	}
}
