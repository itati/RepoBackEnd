package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.TipoRSImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TipoRSRepositoryImpl extends JpaRepository<TipoRSImpl, Long>{
    
}
