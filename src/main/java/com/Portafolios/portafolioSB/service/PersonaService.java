
package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.PersonaImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.PersonaRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepositoryImpl persoRepo;
    
    @Override
    public List<PersonaImpl> verPersonas() {
        return persoRepo.findAll();    
    }

    @Override
    public void crearPersona (PersonaImpl pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public PersonaImpl buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarPersona(Long id, PersonaImpl pers){
       
       PersonaImpl p = persoRepo.findById(id).orElse(null);
       if(p != null){
            p.setNombre(pers.getNombre());
            p.setApellido(pers.getApellido());
            p.setDomicilio(pers.getDomicilio());
            p.setFecha_nac(pers.getFecha_nac());
            p.setSobre_mi(pers.getSobre_mi());
            p.setTel(pers.getTel());
            p.setUrl_foto(pers.getUrl_foto());
            persoRepo.save(p);
       }          
    }
    
}
