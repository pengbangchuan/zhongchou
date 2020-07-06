package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient  //注册到eureka注册中心去
@EnableFeignClients		//标注使用Feign远程调用
public class CloudProviderUserFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProviderUserFeignApplication.class, args);
	}

}
