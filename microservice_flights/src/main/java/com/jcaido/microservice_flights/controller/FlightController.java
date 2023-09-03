package com.jcaido.microservice_flights.controller;

import com.jcaido.microservice_flights.model.Flight;
import com.jcaido.microservice_flights.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "flights/flight/{idFlight}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flight obtainFlightById(@PathVariable("idFlight") int idFlight) {
        return flightService.obtainFlightById(idFlight);
    }

    @GetMapping(value = "flights/{places}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Flight> obtainAvailableFlightsForPlaces(@PathVariable("places") int places) {
        return flightService.obtainAvailableFlightsForPlaces(places);
    }

    @PutMapping(value = "flights/{idFlights}/{places}")
    public void updatePlacesFlight(@PathVariable("idFlights") int idFlight,
                                   @PathVariable("places") int places) {
        flightService.updatePlacesFlight(idFlight, places);
    }
}