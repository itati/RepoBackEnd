package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.RolImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.RolRepositoryImpl;
@Service
public class RolService implements IRolService{
    @Autowired
    public RolRepositoryImpl rolRepo;
    
    @Override
    public List<RolImpl> verRoles ()
    {
        return rolRepo.findAll();
    }
    
    @Override
    public void crearRol (RolImpl rol)
    {
        rolRepo.save(rol);
    }
    
    @Override
    public void borrarRol (Long id)
    {
        rolRepo.deleteById(id);
    }
    
    @Override
    public RolImpl buscarRol (Long id)
    {
        return rolRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarRol(Long id, RolImpl rol)
    {
     RolImpl p = rolRepo.findById(id).orElse(null);
       if(p != null){
           p.setNombre(rol.getNombre());
           p.setDescripcion(rol.getDescripcion());
           p.setEstado(rol.getEstado());
           
           rolRepo.save(p);
       }
    }
    
    
}
