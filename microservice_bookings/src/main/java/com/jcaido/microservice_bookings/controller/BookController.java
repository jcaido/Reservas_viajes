package com.jcaido.microservice_bookings.controller;

import com.jcaido.microservice_bookings.model.Book;
import com.jcaido.microservice_bookings.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping(value = "booking/{totalPersons}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book createBooking(@RequestBody Book book, @PathVariable("totalPersons") int totalPersons) {
        return bookService.createBooking(book, totalPersons);
    }
}
