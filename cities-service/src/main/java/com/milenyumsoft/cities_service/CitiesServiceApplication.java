package com.milenyumsoft.cities_service;

import com.milenyumsoft.cities_service.modelo.Citie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CitiesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesServiceApplication.class, args);


		Citie citie1 = new Citie(1L, "Quito", "South America", "Ecuador", "Active",new ArrayList<>());
		Citie citie2 = new Citie(2L, "Guayaquil", "South America", "Ecuador", "Active", new ArrayList<>());
		Citie citie3 = new Citie(3L, "Cuenca", "South America", "Ecuador", "Active",new ArrayList<>());
		Citie citie4 = new Citie(4L, "Manta", "South America", "Ecuador", "Active", new ArrayList<>());

	}

}
