package com.milenyumsoft.hotels_service.service;

import com.milenyumsoft.hotels_service.modelo.Hotel;
import com.milenyumsoft.hotels_service.repository.IRepositoryHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService implements IHotelService{

    @Autowired
    private IRepositoryHotel repoHotel;


    @Override
    public List<Hotel> hotelAll(){



        return null;
    }

    @Override
    public List<Hotel> hotelAllById(Long city_id){
        return  repoHotel.allHotel(city_id);
    }
}
