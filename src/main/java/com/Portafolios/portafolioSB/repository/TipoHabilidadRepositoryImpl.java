package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.TipoHabilidadImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TipoHabilidadRepositoryImpl extends JpaRepository<TipoHabilidadImpl, Long>{
    
}
