package com.example.salon_za_avtomobili.service.impl.viewImpl;

import com.example.salon_za_avtomobili.model.views.ProdadeniVozilaPoMesec;
import com.example.salon_za_avtomobili.repository.viewRepository.ProdadeniVozilaPoMesecRepository;
import com.example.salon_za_avtomobili.service.viewService.ProdadeniVozilaPoMesecService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdadeniVozilaPoMesecServiceImpl implements ProdadeniVozilaPoMesecService {
    private final ProdadeniVozilaPoMesecRepository prodadeniVozilaPoMesecRepository;

    public ProdadeniVozilaPoMesecServiceImpl(ProdadeniVozilaPoMesecRepository prodadeniVozilaPoMesecRepository) {
        this.prodadeniVozilaPoMesecRepository = prodadeniVozilaPoMesecRepository;
    }

    @Override
    public List<ProdadeniVozilaPoMesec> findAll() {
        return this.prodadeniVozilaPoMesecRepository.findAll();
    }
}
