package com.Portafolios.portafolioSB.service;
import com.Portafolios.portafolioSB.model.TipoRSImpl;
import java.util.List;

public interface ITipoRSService {
    public List<TipoRSImpl> verTipoRS ();
    public void crearTipoRS (TipoRSImpl tipo_RRSS);
    public void borrarTipoRS (Long id);
    public TipoRSImpl buscarTipoRS (Long id);
    public void modificarTipoRS(Long id, TipoRSImpl tipo_RRSS);
}
