package com.example.salon_za_avtomobili.web;

import com.example.salon_za_avtomobili.model.views.*;
import com.example.salon_za_avtomobili.service.viewService.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/izveshtai")
public class ReportsController {
    private final PrometPoMeseciService prometPoMeseciService;
    private final ProcentOdPrometService procentOdPrometService;
    private final KupeniVozilaOdKlientService kupeniVozilaOdKlientService;
    private final ProdadeniVozilaOdVrabotenService prodadeniVozilaOdVrabotenService;
    private final ProdadeniVozilaPoMesecService prodadeniVozilaPoMesecService;
    public ReportsController(PrometPoMeseciService prometPoMeseciService, ProcentOdPrometService procentOdPrometService, KupeniVozilaOdKlientService kupeniVozilaOdKlientService, ProdadeniVozilaOdVrabotenService prodadeniVozilaOdVrabotenService, ProdadeniVozilaPoMesecService prodadeniVozilaPoMesecService) {
        this.prometPoMeseciService = prometPoMeseciService;
        this.procentOdPrometService = procentOdPrometService;
        this.kupeniVozilaOdKlientService = kupeniVozilaOdKlientService;
        this.prodadeniVozilaOdVrabotenService = prodadeniVozilaOdVrabotenService;
        this.prodadeniVozilaPoMesecService = prodadeniVozilaPoMesecService;
    }

    @GetMapping("/prometPoMesec")
    public String getPromet(Model model)
    {
        List<PrometPoMeseci> all=this.prometPoMeseciService.findAll();
        model.addAttribute("all",all);
        return "izveshtai/PrometPoMeseci";
    }
    @GetMapping("/procentOdPromet")
    public String getProcent(Model model)
    {
        List<ProcentOdPromet> all=this.procentOdPrometService.findAll();
        model.addAttribute("all",all);
        return "izveshtai/ProcentOdPromet";
    }
    @GetMapping("/kupeniVozilaOdKlient")
    public String getKlient(Model model)
    {
        List<KupeniVozilaOdKlient> all=this.kupeniVozilaOdKlientService.findAll();
        model.addAttribute("all",all);
        return "izveshtai/KupeniOdKlient";
    }
    @GetMapping("/prodadeniOdVraboten")
    public String getVraboten(Model model)
    {
        List<ProdadeniVozilaOdVraboten> all=this.prodadeniVozilaOdVrabotenService.findAll();
        model.addAttribute("all",all);
        return "izveshtai/ProdadeniOdVraboten";
    }
    @GetMapping("/prodadeniPrimeroci")
    public String getPrimeroci(Model model)
    {
        List<ProdadeniVozilaPoMesec> all=this.prodadeniVozilaPoMesecService.findAll();
        model.addAttribute("all",all);
        return "izveshtai/ProdadeniPrimeroci";
    }
}
