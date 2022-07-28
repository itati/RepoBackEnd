package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.TipoRSImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.TipoRSRepositoryImpl;

@Service
public class TipoRSService implements ITipoRSService{
    
    @Autowired
    public TipoRSRepositoryImpl tipo_RSRepo;
    
    @Override
    public List<TipoRSImpl> verTipoRS() {
        return tipo_RSRepo.findAll();
    }

    @Override
    public void crearTipoRS(TipoRSImpl tipo_RRSS) {
       tipo_RSRepo.save(tipo_RRSS);
    }

    @Override
    public void borrarTipoRS(Long id) {
        tipo_RSRepo.deleteById(id);
    }

    @Override
    public TipoRSImpl buscarTipoRS(Long id) {
        return tipo_RSRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarTipoRS(Long id, TipoRSImpl tipo_RRSS) {
        TipoRSImpl p = tipo_RSRepo.findById(id).orElse(null);
       if(p != null){
           p.setNombre_RRSS(tipo_RRSS.getNombre_RRSS());
           
           tipo_RSRepo.save(p);
       }
    }
    
}
