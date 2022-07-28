package com.Portafolios.portafolioSB.service;
import com.Portafolios.portafolioSB.model.TipoHabilidadImpl;
import java.util.List;

public interface ITipoHabilidadService {
    public List<TipoHabilidadImpl> verTipoHabilidad ();
    public void crearTipoHabilidad (TipoHabilidadImpl tipo_habilidad);
    public void borrarTipoHabilidad (Long id);
    public TipoHabilidadImpl buscarTipoHabilidad (Long id);
    public void modificarTipoHabilidad(Long id, TipoHabilidadImpl tipo_habilidad);
}
