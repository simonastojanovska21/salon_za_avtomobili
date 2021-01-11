package com.example.salon_za_avtomobili.service.tableService;



import com.example.salon_za_avtomobili.model.tables.Prodazba;

import java.util.List;

public interface ProdazbaService {
    List<Prodazba> findAll();
    Prodazba findByVin(String vin);
}
