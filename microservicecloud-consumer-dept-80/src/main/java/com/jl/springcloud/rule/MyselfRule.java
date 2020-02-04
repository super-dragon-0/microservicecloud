package com.jl.springcloud.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyselfRule {

	@Bean
	public IRule getRule() {
		//return new RandomRule();
		return new RandomRule_ZY();  //自定义每台机器五次
	}
}
