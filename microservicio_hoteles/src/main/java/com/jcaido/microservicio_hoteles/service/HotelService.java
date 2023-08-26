package com.jcaido.microservicio_hoteles.service;

import com.jcaido.microservicio_hoteles.model.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> obtainHotels();
    List<Hotel> obtainAvailableHotels();
}
