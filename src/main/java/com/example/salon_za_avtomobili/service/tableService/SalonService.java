package com.example.salon_za_avtomobili.service.tableService;

import com.example.salon_za_avtomobili.model.tables.*;

import java.util.List;

public interface SalonService {
    List<Salon> findAll();
    void KreirajProdazbaKlient(Klient klientEntity, Prodazba prodazbaEntity);
    void KreirajNarackaSoProdazba(Naracka naracka, DopolnitelnaOprema dopolnitelnaOprema);
    void KreiarajProdazbaOdNaracka(Prodazba prodazba,Naracka naracka);
}
