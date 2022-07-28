package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.UsuarioImpl;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Portafolios.portafolioSB.repository.UsuarioRepositoryImpl;

@Service
public class UsuarioService implements IUsuarioService{
     @Autowired
    public UsuarioRepositoryImpl usuarioRepo;
    
    @Override 
    public List<UsuarioImpl> verUsuario ()
    {
        return usuarioRepo.findAll();
    }
    
    @Override
    public void crearUsuario (UsuarioImpl usuario)
    {
        usuarioRepo.save(usuario);
    }
    
    @Override
    public void borrarUsuario (Long id)
    {
        usuarioRepo.deleteById(id);
    }
    
    @Override
    public UsuarioImpl buscarUsuario (Long id)
    {
        return usuarioRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarUsuario(Long id, UsuarioImpl usuario)
    {
        UsuarioImpl p = usuarioRepo.findById(id).orElse(null);
       if(p != null){
           
           p.setNombre_usuario(usuario.getNombre_usuario());
           p.setPassword(usuario.getPassword());
           p.setRol_id(usuario.getRol_id());
           
           usuarioRepo.save(p);
       }
    }
}
