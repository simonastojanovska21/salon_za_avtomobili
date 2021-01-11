package com.example.salon_za_avtomobili.service.impl.viewImpl;

import com.example.salon_za_avtomobili.model.views.NeisporacaiNaracki;
import com.example.salon_za_avtomobili.repository.viewRepository.NeisporacaiNarackiRepository;
import com.example.salon_za_avtomobili.service.viewService.NeisporacaiNarackiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeisporacaiNarackiServiceImpl implements NeisporacaiNarackiService {
    private final NeisporacaiNarackiRepository neisporacaiNarackiRepository;

    public NeisporacaiNarackiServiceImpl(NeisporacaiNarackiRepository neisporacaiNarackiRepository) {
        this.neisporacaiNarackiRepository = neisporacaiNarackiRepository;
    }

    @Override
    public List<NeisporacaiNaracki> findAll() {
        return this.neisporacaiNarackiRepository.findAll();
    }
}
