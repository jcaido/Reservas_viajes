package com.jcaido.microservice_bookings.service;

import com.jcaido.microservice_bookings.model.Book;
import com.jcaido.microservice_bookings.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Autowired
    RestTemplate restTemplate;

    String url = "http://servicio-flights";

    @Override
    public Book createBooking(Book book, int totalPersons) {

        bookRepository.save(book);
        restTemplate.put(url + "/flights/{idFlight}/{places}", null, book.getFlight(), totalPersons);

        return book;
    }

    @Override
    public List<Book> obtenerReservas() {
        return null;
    }
}
