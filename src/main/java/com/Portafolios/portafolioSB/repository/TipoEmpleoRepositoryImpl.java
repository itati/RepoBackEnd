package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.TipoEmpleoImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TipoEmpleoRepositoryImpl  extends JpaRepository <TipoEmpleoImpl, Long>{
    
}

