package com.tmousa.crazyhotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrazyHotels {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CrazyHotels.class, args);
    }
}
