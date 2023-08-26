package com.jcaido.microservicio_hoteles.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "hotels")
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHotel;
    private Integer category;
    private Boolean available;
    private String name;
    private double price;

    public Hotel() {
    }

    public Hotel(Integer idHotel, Integer category, Boolean available, String name, double price) {
        this.idHotel = idHotel;
        this.category = category;
        this.available = available;
        this.name = name;
        this.price = price;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
