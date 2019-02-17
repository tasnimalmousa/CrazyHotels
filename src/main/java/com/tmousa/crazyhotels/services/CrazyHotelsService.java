package com.tmousa.crazyhotels.services;

import com.tmousa.crazyhotels.models.CrazyHotel;
import com.tmousa.crazyhotels.repositories.CrazyHotelsRepository;
import com.tmousa.crazyhotels.utils.filter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CrazyHotelsService implements HotelsService {
    @Autowired
    CrazyHotelsRepository bestHotelsRepository;

    @Autowired
    HotelsFilter hotelsFilter;

    @Override
    public List<CrazyHotel> getHotels() {
        return bestHotelsRepository.get();
    }

    @Override
    public List<CrazyHotel> getHotels(String city, String from, String to, String adultsCount) {
        List<CrazyHotel> hotels = getHotels();
        return filterHotels(hotels, city, from, to, adultsCount);
    }

    @Override
    public List<CrazyHotel> filterHotels(List<CrazyHotel> hotels, String city, String from, String to, String adultsCount) {
        List<CrazyHotel> filteredHotels = hotels;

        if (city != null && !city.isEmpty()) {
            filteredHotels = hotelsFilter.filter(filteredHotels, new CitySpecification(city)).collect(Collectors.toList());
            ;
        }

        if (adultsCount != null && !adultsCount.isEmpty()) {
            filteredHotels = hotelsFilter.filter(filteredHotels, new AdultsCountSpecification(Integer.valueOf(adultsCount))).collect(Collectors.toList());
            ;
        }

        if (from != null && !from.isEmpty()) {
            try {
                filteredHotels = hotelsFilter.filter(filteredHotels, new FromDateSpecification(from)).collect(Collectors.toList());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            ;
        }

        if (to != null && !to.isEmpty()) {
            try {
                filteredHotels = hotelsFilter.filter(filteredHotels, new ToDateSpecification(to)).collect(Collectors.toList());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            ;
        }

        return filteredHotels;
    }
}
