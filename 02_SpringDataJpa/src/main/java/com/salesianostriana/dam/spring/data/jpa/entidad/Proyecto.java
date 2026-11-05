package com.salesianostriana.dam.spring.data.jpa.entidad;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Builder
@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Proyecto {

    @Id @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String descripcion;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Proyecto proyecto = (Proyecto) o;
        return getId() != null && Objects.equals(getId(), proyecto.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }

    @OneToMany (
            mappedBy = "proyecto_id",
            orphanRemoval = false
    )
    @Builder.Default
    private List<Tarea> listaTareas = new ArrayList<>();

    public void agregarTarea (Tarea tarea) {
        this.listaTareas.add(tarea);
        tarea.setProyecto(this);
    }

    public void eliminarTarea (Tarea tarea) {
        this.listaTareas.remove(tarea);
        tarea.setProyecto(null);
    }

}
