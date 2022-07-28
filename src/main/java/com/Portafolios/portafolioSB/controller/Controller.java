package com.Portafolios.portafolioSB.controller;
import com.Portafolios.portafolioSB.model.PersonaImpl;
import com.Portafolios.portafolioSB.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    
    @Autowired    
    private IPersonaService persoServ;
      
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody PersonaImpl pers) {
        persoServ.crearPersona(pers);
    }
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<PersonaImpl> verPersonas () {
        return persoServ.verPersonas();
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    @GetMapping ("/buscar/{id}")
    public PersonaImpl buscarPersona (@PathVariable Long id) {
       return persoServ.buscarPersona(id);
    }
    
    @PutMapping ("/modificar/{id}")
    public void modificarPersona (@PathVariable Long id, @RequestBody PersonaImpl pers) {
        persoServ.modificarPersona(id, pers);
    }
   
    
}
