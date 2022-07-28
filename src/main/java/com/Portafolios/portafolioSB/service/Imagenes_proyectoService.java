package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.Imagenes_proyectoImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.Imagenes_proyectoRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class Imagenes_proyectoService implements IImagenes_proyectoService {
    
    @Autowired
    public Imagenes_proyectoRepositoryImpl imagen;

    @Override
    public List<Imagenes_proyectoImpl> verLinkImg () {
        return imagen.findAll();    
    }

    @Override
    public void crearLinkImg (Imagenes_proyectoImpl img) {
        imagen.save(img);
    }

    @Override
     public void borrarLinImg (Long id) {
        imagen.deleteById(id);
    }

    @Override
    public Imagenes_proyectoImpl buscarImagen (Long id) {
        return imagen.findById(id).orElse(null);
    }
    
    @Override
    public void modificarImagen(Long id, Imagenes_proyectoImpl img){
       
       Imagenes_proyectoImpl p = imagen.findById(id).orElse(null);
       if(p != null){
            p.setLink_imagen(img.getLink_imagen()); ;
            p.setProyecto_id(img.getProyecto_id());
            imagen.save(p);
       }          
    }
}
