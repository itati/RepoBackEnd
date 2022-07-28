package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.RRSSImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.RRSSRepositoryImpl;
@Service
public class RRSSService implements IRRSSService {
    @Autowired
    public RRSSRepositoryImpl redRepo;
       
    @Override
    public List<RRSSImpl> verRedes ()
    {
        return redRepo.findAll();
    }
    
    @Override
    public void crearRed (RRSSImpl red)
    {
        redRepo.save(red);
    }
    
    @Override
    public void borrarRed (Long id)
    {
        redRepo.deleteById(id);
    }
    
    @Override
    public RRSSImpl buscarRed (Long id)
    {
        return redRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarRed(Long id, RRSSImpl red)
    {
        RRSSImpl p = redRepo.findById(id).orElse(null);
       if(p != null){
           p.setTipo_RRSS(red.getTipo_RRSS());
           p.setPersona_id(red.getPersona_id());
           p.setLink_RRSS(red.getLink_RRSS());
           
           redRepo.save(p);
       }
    }
}
