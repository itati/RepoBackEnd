package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Imagenes_proyectoImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String link_imagen;
    private Long proyecto_id;
    
    public Imagenes_proyectoImpl() {
    }
    
    public Imagenes_proyectoImpl(Long id, String link_imagen, Long proyecto_id) {
        this.id = id;
        this.link_imagen = link_imagen;
        this.proyecto_id = proyecto_id;
    }
}
