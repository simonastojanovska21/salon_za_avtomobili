package com.example.salon_za_avtomobili.service.tableService;


import com.example.salon_za_avtomobili.model.tables.Klient;

import java.util.List;


public interface KlientService {
    List<Klient> findAll();
    void insertKlient(Klient klientEntity);
}
