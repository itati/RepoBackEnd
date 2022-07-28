package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.ProyectoImpl;
import java.util.List;

public interface IProyectoService {
    public List<ProyectoImpl> verProyectos ();
    public void crearProyecto (ProyectoImpl proy);
    public void borrarProyecto (Long id);
    public ProyectoImpl buscarProyecto (Long id);
    public void modificarProyecto(Long id_proyecto, ProyectoImpl proy);
}
