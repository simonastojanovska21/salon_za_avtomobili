package com.example.salon_za_avtomobili.repository.tableRepository;


import com.example.salon_za_avtomobili.model.tables.Prodazba;
import com.example.salon_za_avtomobili.model.tables.ProdazbaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdazbaRepository extends JpaRepository<Prodazba, ProdazbaPK> {
}
