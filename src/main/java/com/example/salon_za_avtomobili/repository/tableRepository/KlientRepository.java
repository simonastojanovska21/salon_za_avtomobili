package com.example.salon_za_avtomobili.repository.tableRepository;


import com.example.salon_za_avtomobili.model.tables.Klient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends JpaRepository<Klient,String> {

}
