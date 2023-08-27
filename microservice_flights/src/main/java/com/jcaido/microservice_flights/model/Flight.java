package com.jcaido.microservice_flights.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "flights")
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVuelo;
    private String company;
    private String fecha;
    private Integer places;
    private Double price;

    public Flight() {
    }

    public Flight(Integer idVuelo, String company, String fecha, Integer places, Double price) {
        this.idVuelo = idVuelo;
        this.company = company;
        this.fecha = fecha;
        this.places = places;
        this.price = price;
    }

    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
