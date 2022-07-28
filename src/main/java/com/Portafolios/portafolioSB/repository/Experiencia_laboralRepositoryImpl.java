package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.Experiencia_laboralImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Experiencia_laboralRepositoryImpl extends JpaRepository <Experiencia_laboralImpl, Long>{
    
}
