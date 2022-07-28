package com.Portafolios.portafolioSB.service;
import com.Portafolios.portafolioSB.model.RRSSImpl;
import java.util.List;

public interface IRRSSService {
    public List<RRSSImpl> verRedes ();
    public void crearRed (RRSSImpl red);
    public void borrarRed (Long id);
    public RRSSImpl buscarRed (Long id);
    public void modificarRed(Long id, RRSSImpl red);
}
