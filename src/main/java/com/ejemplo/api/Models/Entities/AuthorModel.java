package com.ejemplo.api.Models.Entities;

import jakarta.persistence.*;


// Entidad que representa la tabla author en la base de datos
@Entity
@Table(name = "author") // Indica el nombre de la tabla
public class AuthorModel {
    @Id // Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que es autoincremental
    private Long id;

    @Column(name = "name", nullable = false) // Indica que es una columna y que no puede ser nula
    private String name;

    @Column(name = "last_name", nullable = false, length = 50) // Indica que tiene un limite
    private String last_name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
