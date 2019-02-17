package com.tmousa.crazyhotels.utils.filter;

import com.tmousa.crazyhotels.models.CrazyHotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FromDateSpecification implements Specification<CrazyHotel> {

    public static final String ISO_INSTANT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";

    private Date fromDate;

    public FromDateSpecification(String fromDate) throws ParseException {
        this.fromDate = new SimpleDateFormat(ISO_INSTANT).parse(fromDate);
    }

    @Override
    public boolean isSatisfied(CrazyHotel hotel) {
        try {
            return fromDate.compareTo(new SimpleDateFormat(ISO_INSTANT).parse(hotel.getFrom())) >= 0;
        } catch (ParseException e) {
            return false;
        }
    }
}
