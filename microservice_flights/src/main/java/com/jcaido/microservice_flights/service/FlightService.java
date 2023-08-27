package com.jcaido.microservice_flights.service;

import com.jcaido.microservice_flights.model.Flight;

import java.util.List;

public interface FlightService {

    Flight createFlight(Flight flight);
    List<Flight> obtainAllFlights();
    List<Flight> obtainAvailableFlightsForPlaces(int places);
    Flight obtainFlightById(int idFlight);
    void updatePlacesFlight(int idFlight, int places);
}
