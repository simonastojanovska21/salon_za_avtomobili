package com.example.salon_za_avtomobili.service.impl.tableImpl;


import com.example.salon_za_avtomobili.model.tables.DopolnitelnaOprema;
import com.example.salon_za_avtomobili.repository.tableRepository.DopolnitelnaOpremaRepository;
import com.example.salon_za_avtomobili.service.tableService.DopolnitelnaOpremaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DopolnitelnaOpremaServiceImpl implements DopolnitelnaOpremaService {
    private final DopolnitelnaOpremaRepository dopolnitelnaOpremaRepository;

    public DopolnitelnaOpremaServiceImpl(DopolnitelnaOpremaRepository dopolnitelnaOpremaRepository) {
        this.dopolnitelnaOpremaRepository = dopolnitelnaOpremaRepository;
    }

    @Override
    public List<DopolnitelnaOprema> findAll() {
        return this.dopolnitelnaOpremaRepository.findAll();
    }

    @Override
    public void save(DopolnitelnaOprema dopolnitelnaOprema) {
        this.dopolnitelnaOpremaRepository.save(dopolnitelnaOprema);
    }
}
