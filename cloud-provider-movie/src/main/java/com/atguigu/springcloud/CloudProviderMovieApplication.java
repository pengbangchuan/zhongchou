package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启注册注解用于注册到注册中心
public class CloudProviderMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProviderMovieApplication.class, args);
	}

}
