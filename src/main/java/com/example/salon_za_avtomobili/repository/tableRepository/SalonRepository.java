package com.example.salon_za_avtomobili.repository.tableRepository;



import com.example.salon_za_avtomobili.model.tables.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends JpaRepository<Salon,Integer> {

}
