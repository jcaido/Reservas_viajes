package com.jcaido.microservice_bookings.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "bookings")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook;
    private String dni;
    private Integer hotel;
    private String name;
    private Integer flight;

    public Book() {
    }

    public Book(Integer idBook, String dni, Integer hotel, String name, Integer flight) {
        this.idBook = idBook;
        this.dni = dni;
        this.hotel = hotel;
        this.name = name;
        this.flight = flight;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getHotel() {
        return hotel;
    }

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }
}
