package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class RolImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String descripcion;
    private String nombre;
    private String estado;
    
    public RolImpl() {
    }
    
    public RolImpl(Long id, String descripcion, String nombre, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.estado = estado;
    }
}
