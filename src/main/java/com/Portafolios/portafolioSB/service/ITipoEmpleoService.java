package com.Portafolios.portafolioSB.service;
import com.Portafolios.portafolioSB.model.TipoEmpleoImpl;
import java.util.List;

public interface ITipoEmpleoService {
    public List<TipoEmpleoImpl> verTipoEmpleo ();
    public void crearTipoEmpleo (TipoEmpleoImpl tipo_empleo);
    public void borrarTipoEmpleo (Long id);
    public TipoEmpleoImpl buscarTipoEmpleo (Long id);
    public void modificarTipoEmpleo(Long id, TipoEmpleoImpl tipo_empleo);
}
