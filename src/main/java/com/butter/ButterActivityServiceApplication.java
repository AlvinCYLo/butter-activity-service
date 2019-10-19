package com.butter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ButterActivityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ButterActivityServiceApplication.class, args);
	}

}