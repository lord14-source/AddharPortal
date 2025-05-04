package com.AddharPortal.AddharPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AddharPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddharPortalApplication.class, args);
		System.out.println(Thread.currentThread().getName());
	}

}
