package com.milenyumsoft.cities_service.service;
import com.milenyumsoft.cities_service.modelo.Citie;
import com.milenyumsoft.cities_service.modelo.Hotel;
import com.milenyumsoft.cities_service.repository.IHotelApi;
import com.milenyumsoft.cities_service.repository.IRepositoryCitie;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitieService implements ICitieService{

    @Autowired
    private IRepositoryCitie repoCitie;

    @Autowired
    private IHotelApi repoApi;

    @Override
    @CircuitBreaker(name = "hotels-service", fallbackMethod = "fallbackGetCitiesHotel")
    @Retry(name = "hotels-service")
    public Citie getCitie(String name, String country) {
        Citie citie = repoCitie.getCitie(name, country);
        List<Hotel> listHotel = repoApi.hotelAllById(citie.getId_citie());
        citie.setListHotel(listHotel); // Mueve esta línea aquí
        createException(); // Lanza la excepción DESPUÉS de asignar los hoteles


        // Lanza una excepción intencionalmente para probar el Circuit Breaker


        return citie;
    }
    // Método de fallback con la firma correcta
    public Citie fallbackGetCitiesHotel(Throwable throwable) {
        System.out.println("Fallback ejecutado: " + throwable.getMessage());
        return new Citie(999999999L, "Fallido", "Fallido", "Fallido", "Fallido", null);
    }


    // Método que lanza la excepción
    public void createException() {
        throw new IllegalArgumentException("Prueba Resilience y Circuit Breaker estoy aqui");
    }
}