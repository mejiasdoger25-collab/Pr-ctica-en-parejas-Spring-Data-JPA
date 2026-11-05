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
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;

    private boolean estado;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Tarea tarea = (Tarea) o;
        return getId() != null && Objects.equals(getId(), tarea.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }


    @ManyToOne
    private Proyecto proyecto;


    @OneToMany (
            mappedBy = "tarea_id",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Builder.Default
    private List<Comentario> listaComentaios = new ArrayList<>();

    public void agregarTarea (Comentario comentario) {
        this.listaComentaios.add(comentario);
        comentario.setTarea(this);
    }

    public void eliminarTarea (Comentario comentario) {
        this.listaComentaios.remove(comentario);
        comentario.setTarea(null);
    }

}
