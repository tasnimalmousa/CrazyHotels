package com.tmousa.crazyhotels.utils.filter;

import com.tmousa.crazyhotels.models.CrazyHotel;

public class CitySpecification implements Specification<CrazyHotel> {

    private String city;

    public CitySpecification(String city) {
        this.city = city;
    }

    @Override
    public boolean isSatisfied(CrazyHotel hotel) {
        return city.equals(hotel.getCity());
    }
}
