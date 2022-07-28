package com.Portafolios.portafolioSB.repository;
import com.Portafolios.portafolioSB.model.RRSSImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RRSSRepositoryImpl   extends JpaRepository <RRSSImpl, Long>{
    
}
