package com.jcaido.microservicio_hoteles.service;

import com.jcaido.microservicio_hoteles.model.Hotel;
import com.jcaido.microservicio_hoteles.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> obtainHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> obtainAvailableHotels() {
        List<Hotel> availableHotels = hotelRepository.findAll();

        return availableHotels.stream().filter(hotel -> hotel.getAvailable().equals(true)).collect(Collectors.toList());
    }
}
