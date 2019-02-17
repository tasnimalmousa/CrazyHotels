package com.tmousa.crazyhotels.repositories;

import com.tmousa.crazyhotels.models.CrazyHotel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CrazyHotelsRepository {

    public List<CrazyHotel> get() {
        ArrayList<CrazyHotel> hotels = new ArrayList<CrazyHotel>();

        CrazyHotel crazyHotel1 = CrazyHotel.builder()
                .HotelName("Crazy Hotel 1")
                .city("AMM")
                .price(100.0)
                .discount(0.10)
                .rate("*")
                .amenities(new String[]{"Pool", "TV"})
                .adultsCount(1)
                .from("2016-02-18T20:15:37.421Z")
                .to("2019-02-18T20:15:37.421Z")
                .build();
        hotels.add(crazyHotel1);

        CrazyHotel crazyHotel2 = CrazyHotel.builder()
                .HotelName("Crazy Hotel 2")
                .city("ZAR")
                .price(100.0)
                .discount(0.10)
                .rate("****")
                .amenities(new String[]{"Pool", "TV"})
                .adultsCount(2)
                .from("2016-02-18T20:15:37.421Z")
                .to("2020-02-18T20:15:37.421Z")
                .build();
        hotels.add(crazyHotel2);

        CrazyHotel crazyHotel3 = CrazyHotel.builder()
                .HotelName("Crazy Hotel 3")
                .city("AMM")
                .price(100.0)
                .discount(0.10)
                .rate("****")
                .amenities(new String[]{"Pool", "TV"})
                .adultsCount(3)
                .from("2016-02-18T20:15:37.421Z")
                .to("2030-02-18T20:15:37.421Z")
                .build();
        hotels.add(crazyHotel3);

        return hotels;
    }
}
