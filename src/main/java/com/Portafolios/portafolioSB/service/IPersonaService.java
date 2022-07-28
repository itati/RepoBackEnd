package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.PersonaImpl;
import java.util.List;

public interface IPersonaService {
    public List<PersonaImpl> verPersonas ();
    public void crearPersona (PersonaImpl pers);
    public void borrarPersona (Long id);
    public PersonaImpl buscarPersona (Long id);
    public void modificarPersona(Long id, PersonaImpl pers);
}
