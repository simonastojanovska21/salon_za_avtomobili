package com.example.salon_za_avtomobili.repository.viewRepository;

import com.example.salon_za_avtomobili.model.views.ProdadeniVozilaOdVraboten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdadeniVozilaOdVrabotenRepository extends JpaRepository<ProdadeniVozilaOdVraboten,Long> {
}
