package com.milenyumsoft.cities_service.controller;

import com.milenyumsoft.cities_service.modelo.Citie;
import com.milenyumsoft.cities_service.service.ICitieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/cities")
public class CitieController {

    @Autowired
    private ICitieService citieServ;


    @GetMapping("/{name}/{country}")
    public Citie getCitie(@PathVariable("name") String name, @PathVariable("country") String country){
        System.out.println(name + " " + country);
        System.out.println("HGola estoy aquyi ");

        return  citieServ.getCitie(name, country);
    }



}
