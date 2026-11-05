package com.salesianostriana.dam.spring.data.jpa.servicio;

import com.salesianostriana.dam.spring.data.jpa.repositorio.TareaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TareaServicio {

    private final TareaRepository tareaRepository;
}
