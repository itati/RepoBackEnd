package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoRSImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String nombre_RRSS;

    public TipoRSImpl() {
    }

    public TipoRSImpl(Long id, String nombreRed) {
        this.id = id;
        this.nombre_RRSS = nombreRed;
    }
    
    
}
