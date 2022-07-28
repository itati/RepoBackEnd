package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.HabilidadImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.HabilidadRepositoryImpl;

@Service
public class HabilidadService implements IHabilidadService{
     @Autowired
    public HabilidadRepositoryImpl habilidadRepo;
    
    @Override 
    public List<HabilidadImpl> verHabilidad ()
    {
        return habilidadRepo.findAll();
    }
    
    @Override
    public void crearHabilidad (HabilidadImpl habilidad)
    {
        habilidadRepo.save(habilidad);
    }
    
    @Override
    public void borrarHabilidad (Long id)
    {
        habilidadRepo.deleteById(id);
    }
    
    @Override
    public HabilidadImpl buscarHabilidad (Long id)
    {
        return habilidadRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarHabilidad(Long id, HabilidadImpl habilidad)
    {
        HabilidadImpl p = habilidadRepo.findById(id).orElse(null);
       if(p != null){
           p.setNombre_habilidad(habilidad.getNombre_habilidad());
           p.setNivel_habilidad(habilidad.getNivel_habilidad());
           p.setPersona_id(habilidad.getPersona_id());
           p.setTipo_habilidad_id(habilidad.getTipo_habilidad_id());
           
           habilidadRepo.save(p);
       }
    }
}
