package com.milenyumsoft.cities_service.service;

import com.milenyumsoft.cities_service.modelo.Citie;
import org.springframework.stereotype.Service;

@Service
public interface ICitieService {

    public Citie getCitie(String name, String country);
}
