package com.example.salon_za_avtomobili.service.impl.tableImpl;


import com.example.salon_za_avtomobili.model.tables.Klient;
import com.example.salon_za_avtomobili.repository.tableRepository.KlientRepository;
import com.example.salon_za_avtomobili.service.tableService.KlientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlientServiceImpl implements KlientService {
    private final KlientRepository klientRepository;

    public KlientServiceImpl(KlientRepository klientRepository) {
        this.klientRepository = klientRepository;
    }

    @Override
    public List<Klient> findAll() {
        return this.klientRepository.findAll();
    }

    @Override
    public void insertKlient(Klient klientEntity) {
        this.klientRepository.save(klientEntity);
    }


}
