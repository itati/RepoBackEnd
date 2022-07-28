
package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.Experiencia_laboralImpl;
import java.util.List;

public interface IExperiencia_laboralService {
    public List<Experiencia_laboralImpl> verExperienciaLaborales ();
    public void crearEperienciaLaboral (Experiencia_laboralImpl exp_lab);
    public void borrarExperienciaLaboral (Long id);
    public Experiencia_laboralImpl buscarExperienciaLaboral (Long id);
    public void modificarExperienciaLaboral(Long id, Experiencia_laboralImpl exp_lab);
}
