package com.milenyumsoft.hotels_service.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    private Long id_hotel;
    private String nombre;
    private int numbersOfStars;
    private Long id_citie;
}
