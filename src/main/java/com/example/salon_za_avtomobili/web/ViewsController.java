package com.example.salon_za_avtomobili.web;

import com.example.salon_za_avtomobili.model.views.NeisporacaiNaracki;
import com.example.salon_za_avtomobili.model.views.PrikazNaPrimeroci;
import com.example.salon_za_avtomobili.service.viewService.NeisporacaiNarackiService;
import com.example.salon_za_avtomobili.service.viewService.PrikazNaPrimerociService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pogledi")
public class ViewsController {
    private final PrikazNaPrimerociService prikazNaPrimerociService;
    private final NeisporacaiNarackiService neisporacaiNarackiService;

    public ViewsController(PrikazNaPrimerociService prikazNaPrimerociService, NeisporacaiNarackiService neisporacaiNarackiService) {
        this.prikazNaPrimerociService = prikazNaPrimerociService;
        this.neisporacaiNarackiService = neisporacaiNarackiService;
    }

    @GetMapping("/primerociVoSaloni")
    public String getPrimeroci(Model model)
    {
        List<PrikazNaPrimeroci> all=this.prikazNaPrimerociService.findAll();
        model.addAttribute("all",all);
        return "pogledi/PrimerociVoSaloni";
    }
    @GetMapping("/neisporacaniNaracki")
    public String getNaracki(Model model)
    {
        List<NeisporacaiNaracki> all=this.neisporacaiNarackiService.findAll();
        model.addAttribute("all",all);
        return "pogledi/NeisporacaniNaracki";
    }
}
