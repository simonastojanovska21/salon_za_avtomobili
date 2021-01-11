package com.example.salon_za_avtomobili.repository.viewRepository;

import com.example.salon_za_avtomobili.model.views.KupeniVozilaOdKlient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KupeniVozilaOdKlientRepository extends JpaRepository<KupeniVozilaOdKlient,Long> {
}
