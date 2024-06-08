package pe.edu.cibertec.DAAII_T1_HuamanchumoManuel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/inicio","/","/home","/index"})
    public String listadoTotal(Model model) {

        return "auth/home";
    }
}