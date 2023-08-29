package com.jcaido.microservice_bookings.service;

import com.jcaido.microservice_bookings.model.Book;

import java.util.List;

public interface BookService {
    Book createBooking(Book book, int totalPersons);
    List<Book> obtenerReservas();
}
