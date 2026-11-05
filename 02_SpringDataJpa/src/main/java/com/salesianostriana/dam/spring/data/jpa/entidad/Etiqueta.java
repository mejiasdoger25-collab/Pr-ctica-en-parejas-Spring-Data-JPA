package com.salesianostriana.dam.spring.data.jpa.entidad;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Etiqueta {

    @Id @GeneratedValue
    private Long id;

    private String nombre;

    //@ManyToOne
    //@Builder.default
    //private List<Tarea> tareas = new ArrayList<>;

    //helpers, falta por decidir el lado propietario
}
