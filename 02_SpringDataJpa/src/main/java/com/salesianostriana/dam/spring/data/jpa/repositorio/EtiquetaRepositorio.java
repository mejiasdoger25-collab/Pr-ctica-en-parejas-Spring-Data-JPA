package com.salesianostriana.dam.spring.data.jpa.repositorio;

import com.salesianostriana.dam.spring.data.jpa.entidad.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtiquetaRepositorio extends JpaRepository
        <Etiqueta, Long> {
}