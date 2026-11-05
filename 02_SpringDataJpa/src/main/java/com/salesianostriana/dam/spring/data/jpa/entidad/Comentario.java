package com.salesianostriana.dam.spring.data.jpa.entidad;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Comentario {

    @Id @GeneratedValue
    private Long id;

    private String texto;
    private String autor;

    //@ManyToOne
    //@Builder.default
    //private List<Tarea> comentarios = new ArrayList<>;

    //helpers, falta por decidir el lado propietario
}
