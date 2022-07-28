
package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.Experiencia_laboralImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.Experiencia_laboralRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class Experiencia_laboralService implements IExperiencia_laboralService{
    @Autowired
    public Experiencia_laboralRepositoryImpl exp_labRepo;
        
    @Override
    public List<Experiencia_laboralImpl> verExperienciaLaborales ()
    {
        return exp_labRepo.findAll();  
    }
    
    @Override
    public void crearEperienciaLaboral (Experiencia_laboralImpl exp_lab)
    {
        exp_labRepo.save(exp_lab);
    }
    
    @Override
    public void borrarExperienciaLaboral (Long id)
    {
        exp_labRepo.deleteById(id);
    }
    
    @Override
    public Experiencia_laboralImpl buscarExperienciaLaboral (Long id)
    {
        return exp_labRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarExperienciaLaboral(Long id, Experiencia_laboralImpl exp_lab)
    {
       Experiencia_laboralImpl p = exp_labRepo.findById(id).orElse(null);
       if(p != null){
            p.setNombreEmpresa(exp_lab.getNombreEmpresa());
            p.setEsTrabajoActual(exp_lab.getEsTrabajoActual());
            p.setFecha_fin(exp_lab.getFecha_fin());
            p.setFecha_fin(exp_lab.getFecha_fin());
            p.setDescripcion(exp_lab.getNombreEmpresa());
            p.setTipo_empleo_id(id);
            exp_labRepo.save(p);
       } 
    }
}
