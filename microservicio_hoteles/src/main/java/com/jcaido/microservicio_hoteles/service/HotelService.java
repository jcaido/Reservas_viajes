package com.jcaido.microservicio_hoteles.service;

import com.jcaido.microservicio_hoteles.model.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);
    List<Hotel> obtainHotels();
    List<Hotel> obtainAvailableHotels();
}
