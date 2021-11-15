package com.ntt.bootcamp.miprimermicroservicioclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class MiprimermicroservicioclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiprimermicroservicioclientApplication.class, args);
	}

}
