package com.example.salon_za_avtomobili.service.impl.tableImpl;



import com.example.salon_za_avtomobili.model.tables.*;
import com.example.salon_za_avtomobili.repository.tableRepository.*;
import com.example.salon_za_avtomobili.service.tableService.SalonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonServiceImpl implements SalonService {
    private final SalonRepository salonRepository;
    private final KlientRepository klientRepository;
    private final ProdazbaRepository prodazbaRepository;
    private final PrimerokRepository primerokRepository;
    private final NarackaRepository narackaRepository;
    private final DopolnitelnaOpremaRepository dopolnitelnaOpremaRepository;
    public SalonServiceImpl(SalonRepository salonRepository, KlientRepository klientRepository, ProdazbaRepository prodazbaRepository, PrimerokRepository primerokRepository, NarackaRepository narackaRepository, DopolnitelnaOpremaRepository dopolnitelnaOpremaRepository) {
        this.salonRepository = salonRepository;
        this.klientRepository = klientRepository;
        this.prodazbaRepository = prodazbaRepository;
        this.primerokRepository = primerokRepository;
        this.narackaRepository = narackaRepository;
        this.dopolnitelnaOpremaRepository = dopolnitelnaOpremaRepository;
    }

    @Override
    public List<Salon> findAll() {
        return this.salonRepository.findAll();
    }

    @Override
    public void KreirajProdazbaKlient(Klient klientEntity, Prodazba prodazbaEntity) {
        this.klientRepository.save(klientEntity);
        this.prodazbaRepository.save(prodazbaEntity);
        this.primerokRepository.updatePrimerok(prodazbaEntity.getVin());
    }

    @Override
    public void KreirajNarackaSoProdazba(Naracka naracka, DopolnitelnaOprema dopolnitelnaOprema) {
        this.narackaRepository.save(naracka);
        this.dopolnitelnaOpremaRepository.save(dopolnitelnaOprema);
        this.primerokRepository.updateCenaPrimerok(dopolnitelnaOprema.getCena(),naracka.getVin());
    }

    @Override
    public void KreiarajProdazbaOdNaracka(Prodazba prodazba, Naracka naracka) {
        this.prodazbaRepository.save(prodazba);
        this.primerokRepository.updatePrimerok(naracka.getVin());
    }
}
