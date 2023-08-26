package com.jcaido.microservicio_hoteles.repository;

import com.jcaido.microservicio_hoteles.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
