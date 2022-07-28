package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoHabilidadImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String descripcion;
    int estado;

    public TipoHabilidadImpl() {
    }

    public TipoHabilidadImpl(Long id, String descripcion, int estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    
}
