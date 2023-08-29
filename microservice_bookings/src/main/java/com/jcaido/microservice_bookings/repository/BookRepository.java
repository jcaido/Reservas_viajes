package com.jcaido.microservice_bookings.repository;

import com.jcaido.microservice_bookings.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
