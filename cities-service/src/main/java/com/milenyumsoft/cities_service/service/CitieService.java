package com.milenyumsoft.cities_service.service;

import com.milenyumsoft.cities_service.modelo.Citie;
import com.milenyumsoft.cities_service.modelo.Hotel;
import com.milenyumsoft.cities_service.repository.IHotelApi;
import com.milenyumsoft.cities_service.repository.IRepositoryCitie;
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
    public Citie getCitie(String name, String country){

       Citie citie = repoCitie.getCitie(name,country);
       List<Hotel> listHotel = repoApi.hotelAllById(citie.getId_citie());

       citie.setListHotel(listHotel);





        return citie;
    }
}
