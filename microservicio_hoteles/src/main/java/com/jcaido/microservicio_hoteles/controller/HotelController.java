package com.jcaido.microservicio_hoteles.controller;

import com.jcaido.microservicio_hoteles.model.Hotel;
import com.jcaido.microservicio_hoteles.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;

    @PostMapping(value = "hotels", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Hotel createHotel(@RequestBody  Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @GetMapping(value = "hotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> obtainHotels() {
        return hotelService.obtainHotels();
    }

    @GetMapping(value = "availableHotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> obtainAvailableHotels() {
        return hotelService.obtainAvailableHotels();
    }
}
