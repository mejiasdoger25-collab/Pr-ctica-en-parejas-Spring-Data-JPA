package com.salesianostriana.dam.spring.data.jpa.servicio;

import com.salesianostriana.dam.spring.data.jpa.entidad.Proyecto;
import com.salesianostriana.dam.spring.data.jpa.repositorio.ProyectoRepositorio;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProyectoServicio {

    private final ProyectoRepositorio proyectoRepositorio;


    public Proyecto guardarProyecto (Proyecto proyecto) {

        proyectoRepositorio.save(proyecto);
        return proyecto;

    }

    public List<Proyecto> listarProyectos () {

        List<Proyecto> resultados = proyectoRepositorio.findAll();

        if (resultados.isEmpty())
            throw new RuntimeException();

        return resultados;

    }
}
