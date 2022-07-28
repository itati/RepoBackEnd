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

public class Experiencia_laboralImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String nombreEmpresa;
    private Boolean esTrabajoActual;
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;
    @Temporal(TemporalType.DATE)
    private Date fecha_fin;
    private String descripcion;
    private Long persona_id;
    private Long tipo_empleo_id;
    
    public Experiencia_laboralImpl() {
    }
        
    public Experiencia_laboralImpl(Long id, String nombreEmpresa, Boolean esTrabajoActual, 
            Date fecha_inicio, Date fecha_fin, String descripcion, 
            Long persona_id, Long tipo_empleo_id) {
            this.id = id;
            this.nombreEmpresa = nombreEmpresa;
            this.esTrabajoActual = esTrabajoActual;
            this.fecha_inicio = fecha_inicio;
            this.fecha_fin = fecha_fin;
            this.descripcion = descripcion;
            this.persona_id = persona_id;
            this.tipo_empleo_id = tipo_empleo_id;
    }
}
