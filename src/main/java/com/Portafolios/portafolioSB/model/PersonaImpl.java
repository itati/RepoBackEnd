package com.Portafolios.portafolioSB.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PersonaImpl {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String sobre_mi;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nac;
    private String tel;
    private String url_foto;
    
    public PersonaImpl() {
    }
    
    public PersonaImpl(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public PersonaImpl(Long id, String nombre, String apellido, String domicilio, String sobre_mi, Date fecha_nac, String tel, String url_foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.sobre_mi = sobre_mi;
        this.fecha_nac = fecha_nac;
        this.tel = tel;
        this.url_foto = url_foto;
    }
}
