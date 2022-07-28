package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.Imagenes_proyectoImpl;
import java.util.List;

public interface IImagenes_proyectoService {
    public List<Imagenes_proyectoImpl> verLinkImg ();
    public void crearLinkImg (Imagenes_proyectoImpl img);
    public void borrarLinImg (Long id);
    public Imagenes_proyectoImpl buscarImagen (Long id);
    public void modificarImagen(Long id, Imagenes_proyectoImpl img);
}