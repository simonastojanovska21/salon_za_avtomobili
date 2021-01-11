package com.example.salon_za_avtomobili.service.impl.viewImpl;

import com.example.salon_za_avtomobili.model.views.ProdadeniVozilaOdVraboten;
import com.example.salon_za_avtomobili.repository.viewRepository.ProdadeniVozilaOdVrabotenRepository;
import com.example.salon_za_avtomobili.service.viewService.ProdadeniVozilaOdVrabotenService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdadeniVozilaOdVrabotenServiceImpl implements ProdadeniVozilaOdVrabotenService {
    private final ProdadeniVozilaOdVrabotenRepository prodadeniVozilaOdVrabotenRepository;

    public ProdadeniVozilaOdVrabotenServiceImpl(ProdadeniVozilaOdVrabotenRepository prodadeniVozilaOdVrabotenRepository) {
        this.prodadeniVozilaOdVrabotenRepository = prodadeniVozilaOdVrabotenRepository;
    }

    @Override
    public List<ProdadeniVozilaOdVraboten> findAll() {
        return this.prodadeniVozilaOdVrabotenRepository.findAll();
    }
}
