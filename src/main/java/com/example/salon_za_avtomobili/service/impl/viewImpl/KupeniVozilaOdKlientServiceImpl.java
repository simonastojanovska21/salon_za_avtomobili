package com.example.salon_za_avtomobili.service.impl.viewImpl;

import com.example.salon_za_avtomobili.model.views.KupeniVozilaOdKlient;
import com.example.salon_za_avtomobili.repository.viewRepository.KupeniVozilaOdKlientRepository;
import com.example.salon_za_avtomobili.service.viewService.KupeniVozilaOdKlientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KupeniVozilaOdKlientServiceImpl implements KupeniVozilaOdKlientService {
    private final KupeniVozilaOdKlientRepository kupeniVozilaOdKlientRepository;

    public KupeniVozilaOdKlientServiceImpl(KupeniVozilaOdKlientRepository kupeniVozilaOdKlientRepository) {
        this.kupeniVozilaOdKlientRepository = kupeniVozilaOdKlientRepository;
    }

    @Override
    public List<KupeniVozilaOdKlient> findAll() {
        return this.kupeniVozilaOdKlientRepository.findAll();
    }
}
