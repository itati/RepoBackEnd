package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoEmpleoImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String nombre_tipo;
    
    public TipoEmpleoImpl() {
    }
    
    public TipoEmpleoImpl(Long id, String nombre_tipo) {
        this.id = id;
        this.nombre_tipo = nombre_tipo;
    }
}
