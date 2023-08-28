package com.jcaido.microservice_flights.controller;

import com.jcaido.microservice_flights.model.Flight;
import com.jcaido.microservice_flights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    FlightService flightService;

    @PostMapping(value = "flights", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @GetMapping(value = "flights", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Flight> obtainAllFlights() {
        return flightService.obtainAllFlights();
    }
}