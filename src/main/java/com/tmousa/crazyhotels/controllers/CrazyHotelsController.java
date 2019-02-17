package com.tmousa.crazyhotels.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tmousa.crazyhotels.services.CrazyHotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/crazyHotels")
public class CrazyHotelsController {
    @Autowired
    CrazyHotelsService crazyHotelsService;

    @GetMapping
    @ResponseBody
    public String availableHotels(@RequestParam(required = false) String city,
                                  @RequestParam(required = false) String from,
                                  @RequestParam(required = false) String to,
                                  @RequestParam(required = false) String adultsCount,
                                  HttpServletRequest request) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        String hotelsJSON = mapper.writeValueAsString(crazyHotelsService.getHotels(city, from, to, adultsCount));
        return hotelsJSON;
    }

}
