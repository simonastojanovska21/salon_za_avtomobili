package com.example.salon_za_avtomobili.service.impl.tableImpl;


import com.example.salon_za_avtomobili.model.tables.Vraboten;
import com.example.salon_za_avtomobili.repository.tableRepository.VrabotenRepository;
import com.example.salon_za_avtomobili.service.tableService.VrabotenService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VrabotenServiceImpl  implements VrabotenService {
    private final VrabotenRepository vrabotenRepository;

    public VrabotenServiceImpl(VrabotenRepository vrabotenRepository) {
        this.vrabotenRepository = vrabotenRepository;
    }

    @Override
    public List<Vraboten> findAll() {
        return vrabotenRepository.findAll();
    }
}
