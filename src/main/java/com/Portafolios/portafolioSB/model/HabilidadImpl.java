package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HabilidadImpl {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String nombre_habilidad;
    private Long nivel_habilidad;
    private Long persona_id;
    private Long tipo_habilidad_id;
        
    public HabilidadImpl() {
    }
    
    public HabilidadImpl(Long id, String nombre_habilidad, Long nivel_habilidad, Long persona_id, Long tipo_habilidad_id){
        
        this.id = id;
        this.nombre_habilidad = nombre_habilidad;
        this.nivel_habilidad = nivel_habilidad;
        this.persona_id = persona_id;
        this.tipo_habilidad_id = tipo_habilidad_id;
    }
}
