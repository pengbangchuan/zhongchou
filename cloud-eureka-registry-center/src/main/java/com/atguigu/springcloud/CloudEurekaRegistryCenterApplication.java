package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启Eureka服务,表示是注册中心
public class CloudEurekaRegistryCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaRegistryCenterApplication.class, args);
	}

}
