package com.ejemplo.api.Models.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    // Luego coloco la relacion al autor
}
