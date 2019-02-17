package com.tmousa.crazyhotels.utils.filter;

import com.tmousa.crazyhotels.models.CrazyHotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToDateSpecification implements Specification<CrazyHotel> {

    public static final String ISO_INSTANT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";

    private Date toDate;

    public ToDateSpecification(String toDate) throws ParseException {
        this.toDate = new SimpleDateFormat(ISO_INSTANT).parse(toDate);
    }

    @Override
    public boolean isSatisfied(CrazyHotel hotel) {
        try {
            return toDate.compareTo(new SimpleDateFormat(ISO_INSTANT).parse(hotel.getTo())) <= 0;
        } catch (ParseException e) {
            return false;
        }
    }
}
