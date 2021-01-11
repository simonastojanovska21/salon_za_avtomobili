package com.example.salon_za_avtomobili.service.impl.tableImpl;

import com.example.salon_za_avtomobili.model.tables.Avtomobil;
import com.example.salon_za_avtomobili.repository.tableRepository.AvtomobilRepository;
import com.example.salon_za_avtomobili.service.tableService.AvtomobilService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvtomobilServiceImpl implements AvtomobilService {
    private final AvtomobilRepository avtomobilRepository;

    public AvtomobilServiceImpl(AvtomobilRepository avtomobilRepository) {
        this.avtomobilRepository = avtomobilRepository;
    }

    @Override
    public List<Avtomobil> findAll() {
        return avtomobilRepository.findAll();
    }
}
