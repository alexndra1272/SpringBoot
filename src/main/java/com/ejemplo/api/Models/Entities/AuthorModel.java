package com.ejemplo.api.Models.Entities;

import jakarta.persistence.*;
import lombok.Data;


// Entidad que representa la tabla author en la base de datos
@Entity
@Table(name = "author") // Indica el nombre de la tabla
@Data // Genera los getters y setters
public class AuthorModel {
    @Id // Indica que es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que es autoincremental
    private Long id;

    // Indica que es una columna, no puede ser nulo y se establece un limite
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

}
