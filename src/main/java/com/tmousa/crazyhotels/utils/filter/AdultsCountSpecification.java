package com.tmousa.crazyhotels.utils.filter;


import com.tmousa.crazyhotels.models.CrazyHotel;

public class AdultsCountSpecification implements Specification<CrazyHotel> {

    private int adultsCount;

    public AdultsCountSpecification(int adultsCount) {
        this.adultsCount = adultsCount;
    }

    @Override
    public boolean isSatisfied(CrazyHotel hotel) {
        return hotel.getAdultsCount() == adultsCount;
    }
}
