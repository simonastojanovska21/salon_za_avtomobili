package com.example.salon_za_avtomobili.service.tableService;


import com.example.salon_za_avtomobili.model.tables.DopolnitelnaOprema;

import java.util.List;

public interface DopolnitelnaOpremaService {
    List<DopolnitelnaOprema> findAll();
    void save(DopolnitelnaOprema dopolnitelnaOprema);
}
