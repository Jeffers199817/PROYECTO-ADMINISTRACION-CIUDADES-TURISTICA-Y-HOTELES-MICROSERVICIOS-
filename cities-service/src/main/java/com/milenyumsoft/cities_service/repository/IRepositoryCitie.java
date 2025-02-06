package com.milenyumsoft.cities_service.repository;

import com.milenyumsoft.cities_service.modelo.Citie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class IRepositoryCitie {


    public Citie getCitie(String namne, String country){

        Citie citie1 = new Citie(1L, "Quito", "South America", "Ecuador", "Active",new ArrayList<>());
        Citie citie2 = new Citie(2L, "Guayaquil", "South America", "Ecuador", "Active", new ArrayList<>());
        Citie citie3 = new Citie(3L, "Cuenca", "South America", "Ecuador", "Active",new ArrayList<>());
        Citie citie4 = new Citie(4L, "Manta", "South America", "Ecuador", "Active", new ArrayList<>());

        for(Citie citie: new Citie[]{citie1,citie2,citie3, citie4}){

            if(citie.getName().equals(namne) && citie.getCountry().equals(country)){

                return citie;
            }
        }

        return null;
    }
}
