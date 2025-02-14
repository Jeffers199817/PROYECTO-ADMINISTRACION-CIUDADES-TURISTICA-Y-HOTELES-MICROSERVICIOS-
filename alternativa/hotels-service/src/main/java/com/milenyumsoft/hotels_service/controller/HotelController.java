package com.milenyumsoft.hotels_service.controller;

import com.milenyumsoft.hotels_service.modelo.Hotel;
import com.milenyumsoft.hotels_service.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private IHotelService hotelService;


    @GetMapping("/{city_id}")
    public List<Hotel> hotelAllById(@PathVariable Long city_id){

        return hotelService.hotelAllById(city_id);
    }




}
