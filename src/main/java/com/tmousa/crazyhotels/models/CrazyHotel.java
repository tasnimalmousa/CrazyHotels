package com.tmousa.crazyhotels.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CrazyHotel {
    private String HotelName;

    @JsonIgnore
    private String city;

    private String rate;

    private double price;
    private double discount;

    private String[] amenities;

    @JsonIgnore
    private int adultsCount;

    @JsonIgnore
    private String from;
    @JsonIgnore
    private String to;
}
