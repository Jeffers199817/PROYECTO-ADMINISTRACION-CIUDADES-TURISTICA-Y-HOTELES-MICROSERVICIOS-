package com.milenyumsoft.eureka_sv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSvApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSvApplication.class, args);
		System.out.println("esto es eureka server");
	}

}
