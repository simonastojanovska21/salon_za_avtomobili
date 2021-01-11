package com.example.salon_za_avtomobili.service.impl.viewImpl;

import com.example.salon_za_avtomobili.model.views.ProcentOdPromet;
import com.example.salon_za_avtomobili.repository.viewRepository.ProcentOdPrometRepository;
import com.example.salon_za_avtomobili.service.viewService.ProcentOdPrometService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcentOdPrometServiceImpl implements ProcentOdPrometService {
    private final ProcentOdPrometRepository procentOdPrometRepository;

    public ProcentOdPrometServiceImpl(ProcentOdPrometRepository procentOdPrometRepository) {
        this.procentOdPrometRepository = procentOdPrometRepository;
    }

    @Override
    public List<ProcentOdPromet> findAll() {
        return this.procentOdPrometRepository.findAll();
    }
}
