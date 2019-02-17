package com.tmousa.crazyhotels.services;

import com.tmousa.crazyhotels.models.CrazyHotel;

import java.util.List;

public interface HotelsService {

    List<CrazyHotel> getHotels();

    List<CrazyHotel> getHotels(String city, String from, String to, String adultsCount);

    List<CrazyHotel> filterHotels(List<com.tmousa.crazyhotels.models.CrazyHotel> hotels, String city, String fromDate, String toDate, String adultsCount);
}
