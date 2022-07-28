package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.HabilidadImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepositoryImpl extends JpaRepository <HabilidadImpl, Long>{
    
}
