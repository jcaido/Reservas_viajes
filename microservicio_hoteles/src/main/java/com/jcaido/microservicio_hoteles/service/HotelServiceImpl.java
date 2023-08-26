package com.jcaido.microservicio_hoteles.service;

import com.jcaido.microservicio_hoteles.model.Hotel;
import com.jcaido.microservicio_hoteles.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public List<Hotel> obtainHotels() {
        return hotelRepository.findAll();
    }
}
