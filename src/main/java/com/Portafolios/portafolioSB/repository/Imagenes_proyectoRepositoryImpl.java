package com.Portafolios.portafolioSB.repository;

import com.Portafolios.portafolioSB.model.Imagenes_proyectoImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Imagenes_proyectoRepositoryImpl extends  JpaRepository <Imagenes_proyectoImpl, Long>{
    
}
