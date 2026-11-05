package com.salesianostriana.dam.spring.data.jpa.repositorio;

import com.salesianostriana.dam.spring.data.jpa.entidad.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectoRepositorio extends JpaRepository
    <Proyecto, Long> {
}
