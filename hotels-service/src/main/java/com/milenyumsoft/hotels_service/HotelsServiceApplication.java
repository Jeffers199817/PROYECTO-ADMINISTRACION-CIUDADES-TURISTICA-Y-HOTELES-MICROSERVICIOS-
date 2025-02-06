package com.milenyumsoft.hotels_service;

import com.milenyumsoft.hotels_service.modelo.Hotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class HotelsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelsServiceApplication.class, args);

	}



}
