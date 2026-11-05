package com.salesianostriana.dam.spring.data.jpa.repositorio;

import com.salesianostriana.dam.spring.data.jpa.entidad.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepositorio extends JpaRepository
        <Comentario, Long> {
}
