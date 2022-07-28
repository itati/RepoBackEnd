package com.Portafolios.portafolioSB.service;
import com.Portafolios.portafolioSB.model.RolImpl;
import java.util.List;
public interface IRolService {
    public List<RolImpl> verRoles ();
    public void crearRol (RolImpl rol);
    public void borrarRol (Long id);
    public RolImpl buscarRol (Long id);
    public void modificarRol(Long id, RolImpl rol);
}
