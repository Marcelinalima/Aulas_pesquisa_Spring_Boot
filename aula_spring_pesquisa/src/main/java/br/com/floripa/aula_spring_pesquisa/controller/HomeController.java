package br.com.floripa.aula_spring_pesquisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * @return
     */
    @GetMapping("/home")
    public String home(){
        return "index";
    }
}