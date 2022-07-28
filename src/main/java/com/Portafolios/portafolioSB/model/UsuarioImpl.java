package com.Portafolios.portafolioSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class UsuarioImpl {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String password;
    private String nombre_usuario;
    private Long persona_id;
    private Long rol_id;
    
        
    public UsuarioImpl() {
    }
    
    public UsuarioImpl(Long id, String password, String nombre_usuario, Long persona_id, Long rol_id){
        this.id = id;
        this.password = password;
        this.nombre_usuario = nombre_usuario;
        this.persona_id = persona_id;
        this.rol_id = rol_id;
    }
}
