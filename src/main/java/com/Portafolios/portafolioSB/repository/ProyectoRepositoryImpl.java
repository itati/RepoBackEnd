package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.ProyectoImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepositoryImpl extends JpaRepository <ProyectoImpl, Long>{
    
}
