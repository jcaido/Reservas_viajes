package com.jcaido.microservicio_hoteles.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "hoteles")
public class Hotel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHotel;
    private Integer categoria;
    private Boolean disponible;
    private String nombre;
    private double precio;

    public Hotel() {
    }

    public Hotel(Integer idHotel, Integer categoria, Boolean disponible, String nombre, double precio) {
        this.idHotel = idHotel;
        this.categoria = categoria;
        this.disponible = disponible;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
