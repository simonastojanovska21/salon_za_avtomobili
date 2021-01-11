package com.example.salon_za_avtomobili.repository.tableRepository;


import com.example.salon_za_avtomobili.model.tables.Vraboten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VrabotenRepository extends JpaRepository<Vraboten,String> {
}
