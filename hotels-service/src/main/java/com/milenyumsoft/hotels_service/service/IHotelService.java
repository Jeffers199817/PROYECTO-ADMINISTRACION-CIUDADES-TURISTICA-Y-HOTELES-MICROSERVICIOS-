package com.milenyumsoft.hotels_service.service;

import com.milenyumsoft.hotels_service.modelo.Hotel;

import java.util.List;

public interface IHotelService {


    public List<Hotel> hotelAll();

    public List<Hotel> hotelAllById(Long id_citie);
}
