package com.milenyumsoft.cities_service.modelo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Citie {


    private Long id_citie;
    private String name;
    private String continent;
    private String country;
    private String status;
    private List<Hotel> listHotel = new ArrayList<>();


}
