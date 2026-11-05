package com.salesianostriana.dam.spring.data.jpa.repositorio;

import com.salesianostriana.dam.spring.data.jpa.entidad.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TareaRepository extends JpaRepository
    <Tarea, Long> {
}
