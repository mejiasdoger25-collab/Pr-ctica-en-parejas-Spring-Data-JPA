package com.salesianostriana.dam.spring.data.jpa.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
public class Comentario {

    @Id @GeneratedValue
    private Long id;

    private String texto;
    private String autor;

    @ManyToOne
    private Tarea tarea;

    //helpers, falta por decidir el lado propietario
}
