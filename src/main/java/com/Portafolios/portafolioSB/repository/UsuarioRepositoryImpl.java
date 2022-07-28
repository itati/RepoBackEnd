package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.UsuarioImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositoryImpl extends JpaRepository <UsuarioImpl, Long>{
    
}
