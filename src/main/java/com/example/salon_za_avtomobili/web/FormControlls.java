package com.example.salon_za_avtomobili.web;

import com.example.salon_za_avtomobili.model.tables.*;
import com.example.salon_za_avtomobili.service.tableService.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/formi")
public class FormControlls {
    private final AvtomobilService avtomobilService;
    private final KlientService klientService;
    private final ProdazbaService prodazbaService;
    private final SalonService salonService;
    private final NarackaService narackaService;
    private final DopolnitelnaOpremaService dopolnitelnaOpremaService;
    public FormControlls(AvtomobilService avtomobilService, KlientService klientService, ProdazbaService prodazbaService, SalonService salonService, NarackaService narackaService, DopolnitelnaOpremaService dopolnitelnaOpremaService) {
        this.avtomobilService = avtomobilService;
        this.klientService = klientService;
        this.prodazbaService = prodazbaService;
        this.salonService = salonService;
        this.narackaService = narackaService;
        this.dopolnitelnaOpremaService = dopolnitelnaOpremaService;
    }

    @GetMapping("/klientiProdazba")
    public String form1(Model model)
    {
        List<Avtomobil> avtomobili=this.avtomobilService.findAll();
        model.addAttribute("avtomobili",avtomobili);
        return "/formi/DodadiKlientProdazba";
    }
    @PostMapping("/klientiProdazba")
    public String postForm1(@RequestParam String embg,@RequestParam String ime,@RequestParam String prezime,@RequestParam String telefon,
                            @RequestParam String adresa,@RequestParam int avtomobil,@RequestParam String vin,@RequestParam String embgVrab)
    {
        Klient klientEntity=new Klient(embg,ime,prezime, telefon,adresa);
        this.klientService.insertKlient(klientEntity);
        Date date=new Date(Calendar.getInstance().getTimeInMillis());
        Prodazba prodazbaEntity=new Prodazba(vin,avtomobil,embg,embgVrab,date);
        this.salonService.KreirajProdazbaKlient(klientEntity,prodazbaEntity);
        return "redirect:/";
    }
    @GetMapping("/narackaOprema")
    public String form2(Model model)
    {
        List<Avtomobil> avtomobili=this.avtomobilService.findAll();
        model.addAttribute("avtomobili",avtomobili);
        return "/formi/KreirajNarackaSoOprema";
    }
    @PostMapping("/narackaOprema")
    public String postForm2(@RequestParam int avtomobil,@RequestParam String vin,@RequestParam String embgKlient,
                            @RequestParam String embgVraboten, @RequestParam String naziv,@RequestParam int cena)
    {
        Date date=new Date(Calendar.getInstance().getTimeInMillis()+1000000000);
        Naracka naracka=new Naracka(133,date,vin,avtomobil,embgKlient,embgVraboten);
        this.narackaService.save(naracka);
        DopolnitelnaOprema dopolnitelnaOprema=new DopolnitelnaOprema(206,naziv,cena,133);
        this.dopolnitelnaOpremaService.save(dopolnitelnaOprema);
        this.salonService.KreirajNarackaSoProdazba(naracka,dopolnitelnaOprema);
        return "redirect:/";
    }
    @GetMapping("/prodazbaNaracka")
    public String form3(Model model)
    {
        List<Avtomobil> avtomobili=this.avtomobilService.findAll();
        model.addAttribute("avtomobili",avtomobili);
        return "/formi/KreirajProdazbaOdNaracka";
    }
    @PostMapping("/prodazbaNaracka")
    public String postform3(@RequestParam int avtomobil,@RequestParam String vin)
    {
        Date date=new Date(Calendar.getInstance().getTimeInMillis());
        Naracka naracka=this.narackaService.findByVin(vin);
        Prodazba prodazba=new Prodazba(vin,avtomobil,naracka.getEmbgKlient(),naracka.getEmbgVraboten()
        ,date);
        this.salonService.KreiarajProdazbaOdNaracka(prodazba,naracka);
        return "redirect:/";
    }
}
