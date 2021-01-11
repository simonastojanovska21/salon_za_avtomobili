package com.example.salon_za_avtomobili.repository.tableRepository;


import com.example.salon_za_avtomobili.model.tables.Primerok;
import com.example.salon_za_avtomobili.model.tables.PrimerokPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PrimerokRepository extends JpaRepository<Primerok, PrimerokPK> {
    @Transactional
    @Modifying
    @Query("update Primerok set dostapen='ne' where vin= :vin")
    void updatePrimerok(@Param("vin") String vin);
    @Transactional
    @Modifying
    @Query("update Primerok set cena=cena+ :dopCena where vin=:vin")
    void updateCenaPrimerok(@Param("dopCena") int dopCena,@Param("vin") String vin);
}
