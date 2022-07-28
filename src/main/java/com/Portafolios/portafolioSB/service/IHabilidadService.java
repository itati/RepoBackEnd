package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.HabilidadImpl;
import java.util.List;

public interface IHabilidadService {
    public List<HabilidadImpl> verHabilidad ();
    public void crearHabilidad (HabilidadImpl pers);
    public void borrarHabilidad (Long id);
    public HabilidadImpl buscarHabilidad (Long id);
    public void modificarHabilidad(Long id, HabilidadImpl habilidad);
}
