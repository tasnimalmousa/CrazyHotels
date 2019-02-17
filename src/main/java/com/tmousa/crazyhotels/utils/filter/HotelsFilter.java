package com.tmousa.crazyhotels.utils.filter;

import com.tmousa.crazyhotels.models.CrazyHotel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class HotelsFilter implements Filter<CrazyHotel> {

    @Override
    public Stream<CrazyHotel> filter(List<CrazyHotel> items, Specification<CrazyHotel> specification) {
        return items.stream().filter(hotel -> specification.isSatisfied(hotel));
    }
}
