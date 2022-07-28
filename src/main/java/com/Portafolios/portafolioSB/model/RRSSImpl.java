package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class RRSSImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private Long tipo_RRSS;
    private Long persona_id;
    private String link_RRSS;
    
    public RRSSImpl() {
    }
    
    public RRSSImpl(Long id, Long tipo_RRSS, Long persona_id, String link_RRSS) {
        this.id = id;
        this.tipo_RRSS = tipo_RRSS;
        this.persona_id = persona_id;
        this.link_RRSS = link_RRSS;
    }
}
