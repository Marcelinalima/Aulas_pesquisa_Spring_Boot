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

    
    /**
     * @param model
     * @return
     */
    @GetMapping("/form-pesquisa")
    public String carregaPaginaDeInsercao(Model model){
        model.addAttribute("pesquisa " , new Pesquisa ()); 
              return "inserir-pesquisa";
        
    }
    
    
    
    @PostMapping("/salvar")
    public String novaPesquisa(@ModelAttribute("pesquisa") Pesquisa pesquisa) {
        System.out.println("Pesquisa:" + pesquisa);
        
        return "inserir-pesquisa";
    }
}    
