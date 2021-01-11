package com.example.salon_za_avtomobili.service.impl.viewImpl;

import com.example.salon_za_avtomobili.model.views.PrikazNaPrimeroci;
import com.example.salon_za_avtomobili.repository.viewRepository.PrikazNaPrimerociRepository;
import com.example.salon_za_avtomobili.service.viewService.PrikazNaPrimerociService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrikazNaPrimerociServiceImpl implements PrikazNaPrimerociService {
    private final PrikazNaPrimerociRepository prikazNaPrimerociRepository;

    public PrikazNaPrimerociServiceImpl(PrikazNaPrimerociRepository prikazNaPrimerociRepository) {
        this.prikazNaPrimerociRepository = prikazNaPrimerociRepository;
    }

    @Override
    public List<PrikazNaPrimeroci> findAll() {
        return this.prikazNaPrimerociRepository.findAll();
    }
}
