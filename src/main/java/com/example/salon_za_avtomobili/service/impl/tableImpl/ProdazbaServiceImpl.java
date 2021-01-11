package com.example.salon_za_avtomobili.service.impl.tableImpl;


import com.example.salon_za_avtomobili.model.tables.Prodazba;
import com.example.salon_za_avtomobili.repository.tableRepository.ProdazbaRepository;
import com.example.salon_za_avtomobili.service.tableService.ProdazbaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdazbaServiceImpl implements ProdazbaService {
    private final ProdazbaRepository prodazbaRepository;

    public ProdazbaServiceImpl(ProdazbaRepository prodazbaRepository) {
        this.prodazbaRepository = prodazbaRepository;
    }

    @Override
    public List<Prodazba> findAll() {
        return this.prodazbaRepository.findAll();
    }

    @Override
    public Prodazba findByVin(String vin) {
        return this.prodazbaRepository.findAll().stream().filter(prodazba -> prodazba.getVin().equals(vin))
                .findFirst().get();
    }
}
