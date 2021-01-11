package com.example.salon_za_avtomobili.web;

import com.example.salon_za_avtomobili.model.tables.Naracka;
import com.example.salon_za_avtomobili.model.tables.Prodazba;
import com.example.salon_za_avtomobili.service.tableService.NarackaService;
import com.example.salon_za_avtomobili.service.tableService.ProdazbaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private final ProdazbaService prodazbaService;
    private final NarackaService narackaService;
    public HomeController(ProdazbaService prodazbaService, NarackaService narackaService) {
        this.prodazbaService = prodazbaService;
        this.narackaService = narackaService;
    }
    @GetMapping
    public String getHomePage(Model model)
    {
        return "Home";
    }
    @GetMapping("/prodazbi")
    public String getSales(Model model)
    {
        List<Prodazba> all=this.prodazbaService.findAll();
        model.addAttribute("all",all);
        return "Prodazbi";
    }
    @GetMapping("/naracki")
    public String getNaracki(Model model)
    {
        List<Naracka> all=this.narackaService.findAll();
        model.addAttribute("all",all);
        return "Naracki";
    }
}
