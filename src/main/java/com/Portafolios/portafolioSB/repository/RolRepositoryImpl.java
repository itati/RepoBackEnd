package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.RolImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RolRepositoryImpl  extends JpaRepository <RolImpl, Long>{
    
}
