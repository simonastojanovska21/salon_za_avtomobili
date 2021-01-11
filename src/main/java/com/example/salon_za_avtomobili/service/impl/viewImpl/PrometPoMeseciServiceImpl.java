package com.example.salon_za_avtomobili.service.impl.viewImpl;

import com.example.salon_za_avtomobili.model.views.PrometPoMeseci;
import com.example.salon_za_avtomobili.repository.viewRepository.PrometPoMeseciRepository;
import com.example.salon_za_avtomobili.service.viewService.PrometPoMeseciService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrometPoMeseciServiceImpl implements PrometPoMeseciService {
    private final PrometPoMeseciRepository prometPoMeseciRepository;

    public PrometPoMeseciServiceImpl(PrometPoMeseciRepository prometPoMeseciRepository) {
        this.prometPoMeseciRepository = prometPoMeseciRepository;
    }

    @Override
    public List<PrometPoMeseci> findAll() {
        return this.prometPoMeseciRepository.findAll();
    }
}
