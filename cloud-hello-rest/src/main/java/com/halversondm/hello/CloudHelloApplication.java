package com.halversondm.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CloudHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudHelloApplication.class, args);
	}

}
