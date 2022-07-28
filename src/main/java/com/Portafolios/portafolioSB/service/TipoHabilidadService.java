package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.TipoHabilidadImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.TipoHabilidadRepositoryImpl;

@Service
public class TipoHabilidadService implements ITipoHabilidadService{
    
    @Autowired
    public TipoHabilidadRepositoryImpl tipo_habilidadRepo;
    
    @Override
    public List<TipoHabilidadImpl> verTipoHabilidad() {
        return tipo_habilidadRepo.findAll();
    }

    @Override
    public void crearTipoHabilidad(TipoHabilidadImpl tipo_habilidad) {
       tipo_habilidadRepo.save(tipo_habilidad);
    }

    @Override
    public void borrarTipoHabilidad(Long id) {
        tipo_habilidadRepo.deleteById(id);
    }

    @Override
    public TipoHabilidadImpl buscarTipoHabilidad(Long id) {
        return tipo_habilidadRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarTipoHabilidad(Long id, TipoHabilidadImpl tipo_habilidad) {
        TipoHabilidadImpl p = tipo_habilidadRepo.findById(id).orElse(null);
       if(p != null){
           p.setDescripcion(tipo_habilidad.getDescripcion());
           p.setEstado(tipo_habilidad.getEstado());
           
           tipo_habilidadRepo.save(p);
       }
    }
    
}
