package com.example.salon_za_avtomobili.service.impl.tableImpl;


import com.example.salon_za_avtomobili.model.tables.Primerok;
import com.example.salon_za_avtomobili.repository.tableRepository.PrimerokRepository;
import com.example.salon_za_avtomobili.service.tableService.PrimerokService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimerokServiceImpl implements PrimerokService {
    private final PrimerokRepository primerokRepository;

    public PrimerokServiceImpl(PrimerokRepository primerokRepository) {
        this.primerokRepository = primerokRepository;
    }

    @Override
    public List<Primerok> findAll() {
        return primerokRepository.findAll();
    }


}
