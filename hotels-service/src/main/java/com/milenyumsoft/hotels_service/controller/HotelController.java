package com.milenyumsoft.hotels_service.controller;

import com.milenyumsoft.hotels_service.modelo.Hotel;
import com.milenyumsoft.hotels_service.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private IHotelService hotelService;


    @GetMapping("/{id_citie}")
    public List<Hotel> hotelAllById(@PathVariable Long id_citie){

        return hotelService.hotelAllById(id_citie);
    }




}
