package com.example.salon_za_avtomobili.repository.tableRepository;


import com.example.salon_za_avtomobili.model.tables.Naracka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NarackaRepository extends JpaRepository<Naracka,Integer> {
}
