package com.example.salon_za_avtomobili.service.tableService;



import com.example.salon_za_avtomobili.model.tables.Naracka;

import java.util.List;
import java.util.Optional;

public interface NarackaService {
    List<Naracka> findAll();
    void save(Naracka naracka) ;
    Naracka findByVin(String vin);
}
