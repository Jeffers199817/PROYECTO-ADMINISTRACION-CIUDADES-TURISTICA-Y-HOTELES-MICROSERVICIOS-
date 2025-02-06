package com.milenyumsoft.cities_service.repository;

import com.milenyumsoft.cities_service.modelo.Citie;
import com.milenyumsoft.cities_service.modelo.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name="hotel-service")
public interface IHotelApi {

    @GetMapping("{/id_citie}")
    public List<Hotel> hotelAllById(@PathVariable("id_citie") Long id_citie);
}
