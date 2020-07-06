package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProviderUserApplication.class, args);
	}
	
	@Bean
	@LoadBalanced //负载均衡注解，默认使用Ribbon，是客户端的负载均衡，客户端决定去调用那个服务端节点。
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
