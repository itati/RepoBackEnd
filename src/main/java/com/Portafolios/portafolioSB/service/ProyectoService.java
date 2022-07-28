package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.ProyectoImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.ProyectoRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepositoryImpl proyRepo;
    
    @Override
    public List<ProyectoImpl> verProyectos() {
        return proyRepo.findAll();    
    }

    @Override
    public void crearProyecto (ProyectoImpl proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public ProyectoImpl buscarProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarProyecto(Long id_proyecto, ProyectoImpl proy){
       
       ProyectoImpl p = proyRepo.findById(id_proyecto).orElse(null);
       if(p != null){
           p.setNombre_proyecto(proy.getNombre_proyecto());
           p.setFecha_proyecto(proy.getFecha_proyecto());
           p.setDescripcion_proyecto(proy.getDescripcion_proyecto());
           proyRepo.save(p);
       }          
    }
}
