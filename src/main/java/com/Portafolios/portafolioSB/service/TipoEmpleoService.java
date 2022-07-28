package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.TipoEmpleoImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.TipoEmpleoRepositoryImpl;

@Service
public class TipoEmpleoService implements ITipoEmpleoService{
    @Autowired
    public TipoEmpleoRepositoryImpl tipo_empleoRepo;

    @Override
    public List<TipoEmpleoImpl> verTipoEmpleo() {
        return tipo_empleoRepo.findAll();
    }

    @Override
    public void crearTipoEmpleo(TipoEmpleoImpl tipo_empleo) {
        tipo_empleoRepo.save(tipo_empleo);
    }

    @Override
    public void borrarTipoEmpleo(Long id) {
        tipo_empleoRepo.deleteById(id);
    }

    @Override
    public TipoEmpleoImpl buscarTipoEmpleo(Long id) {
        return tipo_empleoRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarTipoEmpleo(Long id, TipoEmpleoImpl tipo_empleo) {
        TipoEmpleoImpl p = tipo_empleoRepo.findById(id).orElse(null);
       if(p != null){
           p.setNombre_tipo(tipo_empleo.getNombre_tipo());
           
           tipo_empleoRepo.save(p);
       }
    }
    
}
