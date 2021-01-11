package com.example.salon_za_avtomobili.service.impl.tableImpl;


import com.example.salon_za_avtomobili.model.tables.Naracka;
import com.example.salon_za_avtomobili.repository.tableRepository.NarackaRepository;
import com.example.salon_za_avtomobili.service.tableService.NarackaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NarackaServiceImpl implements NarackaService {
    private final NarackaRepository narackaRepository;

    public NarackaServiceImpl(NarackaRepository narackaRepository) {
        this.narackaRepository = narackaRepository;
    }

    @Override
    public List<Naracka> findAll() {
        return this.narackaRepository.findAll();
    }

    @Override
    public void save(Naracka naracka) {
        this.narackaRepository.save(naracka);
    }

    @Override
    public Naracka findByVin(String vin) {
        return this.narackaRepository.findAll().stream().filter(naracka -> naracka.getVin().equals(vin))
                .findFirst().get();
    }
}
