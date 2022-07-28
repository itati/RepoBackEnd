package com.Portafolios.portafolioSB.service;

import com.Portafolios.portafolioSB.model.UsuarioImpl;
import java.util.List;

public interface IUsuarioService {
    public List<UsuarioImpl> verUsuario ();
    public void crearUsuario (UsuarioImpl usuario);
    public void borrarUsuario (Long id);
    public UsuarioImpl buscarUsuario (Long id);
    public void modificarUsuario(Long id, UsuarioImpl usuario);
}
