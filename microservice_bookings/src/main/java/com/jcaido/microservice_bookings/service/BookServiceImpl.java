package com.jcaido.microservice_bookings.service;

import com.jcaido.microservice_bookings.model.Book;
import com.jcaido.microservice_bookings.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book createBooking(Book book, int totalPersons) {
        return null;
    }

    @Override
    public List<Book> obtenerReservas() {
        return null;
    }
}
