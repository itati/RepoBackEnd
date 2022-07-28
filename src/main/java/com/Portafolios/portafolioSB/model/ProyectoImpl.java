package com.Portafolios.portafolioSB.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ProyectoImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id_proyecto;
    private String nombre_proyecto;
    @Temporal(TemporalType.DATE)
    private Date fecha_proyecto;
    private String descripcion_proyecto;
    private Long persona_id;
    
    public ProyectoImpl() {
    }
    
    public ProyectoImpl(Long id_proyecto, String nombre_proyecto, Date fecha_proyecto, String descripcion_proyecto, String link_proyecto, Long persona_id) {
        this.id_proyecto = id_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.fecha_proyecto = fecha_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
        this.persona_id = persona_id;
    }
}
