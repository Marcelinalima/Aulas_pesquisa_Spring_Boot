package br.com.floripa.aula_spring_pesquisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.floripa.aula_spring_pesquisa.model.entidades.Pesquisa;

@Controller
@RequestMapping("/pesquisas")
public class PesquisaController {

    
    @GetMapping("/nova-pesquisa")

    public String carregaFormulario(Model model){
        model.addAttribute("pesquisa",new Pesquisa()); 
              return "form-pesquisa";
        
    }
    
    @PostMapping
    public String salvar(@ModelAttribute("pesquisa") Pesquisa pesquisa){
        System.out.println("PESQUISA:" + pesquisa);
        
        return "form-pesquisa";
    }
    
}