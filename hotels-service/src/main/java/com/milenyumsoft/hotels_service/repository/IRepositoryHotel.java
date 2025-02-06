package com.milenyumsoft.hotels_service.repository;

import com.milenyumsoft.hotels_service.modelo.Hotel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IRepositoryHotel {

    public List<Hotel> allHotel(Long id_citie){

        List<Hotel> listHotel = new ArrayList<>();



        Hotel hotel1 = new Hotel(1L, "Swissotel Quito", 5, 1L);
        Hotel hotel2 = new Hotel(2L, "JW Marriott Quito", 5, 1L);
        Hotel hotel3 = new Hotel(3L, "Hilton Colon Quito", 4, 1L);
        Hotel hotel4 = new Hotel(4L, "Hotel Dann Carlton Quito", 4, 1L);
        Hotel hotel5 = new Hotel(5L, "Hotel Finlandia", 3, 1L);

        Hotel hotel6 = new Hotel(6L, "Hotel Oro Verde Guayaquil", 5, 2L);
        Hotel hotel7 = new Hotel(7L, "Hilton Colon Guayaquil", 5, 2L);

        Hotel hotel8 = new Hotel(8L, "Hotel Santa Lucia", 4, 3L);
        Hotel hotel9 = new Hotel(9L, "Hotel Victoria Cuenca", 4, 3L);

        Hotel hotel10 = new Hotel(10L, "Wyndham Manta Sail Plaza", 5, 4L);

        for(Hotel hotel: new Hotel[]{hotel1,hotel2,hotel3,hotel4,hotel5,hotel6,hotel7,hotel8,hotel9,hotel10}) {

            if(hotel.getId_citie()==id_citie){

                listHotel.add(hotel);
            }



        }

        return listHotel;

    }
}
