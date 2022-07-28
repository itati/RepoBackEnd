package com.Portafolios.portafolioSB.repository;

import com.Portafolios.portafolioSB.model.PersonaImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositoryImpl extends JpaRepository <PersonaImpl, Long>{
    
}
