package com.jcaido.microservice_flights.service;

import com.jcaido.microservice_flights.model.Flight;
import com.jcaido.microservice_flights.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService{

    @Autowired
    FlightRepository flightRepository;

    @Override
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> obtainAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public List<Flight> obtainAvailableFlightsForPlaces(int places) {
        return flightRepository.findAll().stream()
                .filter(flight -> flight.getPlaces()>= places)
                .collect(Collectors.toList());
    }

    @Override
    public Flight obtainFlightById(int idFlight) {
        return flightRepository.findById(idFlight).orElseThrow();
    }

    @Override
    public void updatePlacesFlight(int idFlight, int places) {
        Flight flight = flightRepository.findById(idFlight).orElseThrow();
        flight.setPlaces(flight.getPlaces() - places);
        flightRepository.save(flight);
    }
}
