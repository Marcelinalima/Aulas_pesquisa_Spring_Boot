package br.com.floripa.aula_spring_pesquisa.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.floripa.aula_spring_pesquisa.exceptions.ObjetoNaoEncontradoException;
import br.com.floripa.aula_spring_pesquisa.model.dto.PesquisaDto;
import br.com.floripa.aula_spring_pesquisa.model.dto.PesquisaInserirDto;
import br.com.floripa.aula_spring_pesquisa.model.entidades.Pesquisa;
import br.com.floripa.aula_spring_pesquisa.service.PesquisaService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.Getter;
@Controller
@RequestMapping("/pesquisas")
public class PesquisaController {


    @Autowired @Getter
    private PesquisaService service;
  
    @GetMapping("/formulario-pesquisa")
    public String carregaFormulario( @PathParam("id") Long id, Model model)throws ObjetoNaoEncontradoException{
        if(Objects.nonNull(id)){
        Pesquisa pesquisa = service.procurarPeloId(id);// procura no banco de dados
        model.addAttribute("pesquisa", pesquisa);
          return "form-pesquisa";
      }
        model.addAttribute("pesquisa", new PesquisaInserirDto());
        return "form-pesquisa";
    }
    @GetMapping
    public String procurarTodos(Model model){
      model.addAttribute("pesquisas", service.findAll());
      return "lista-pesquisas";

    }
    
    @PostMapping
    public String salvar (@ModelAttribute("pesquisa") @Valid PesquisaInserirDto pesquisa, Errors errors)throws Exception{
         if(!errors.hasErrors()){
          PesquisaDto pesquisaSalva = service.salvar(pesquisa);
           pesquisa.setId(pesquisaSalva.getId());
           return "redirect:/pesquisas";
        
        }
           return "redirect:/pesquisas";
    }
    @GetMapping("/remover")
    public String deletar(@PathParam("id") Long id) {
        service.removerPeloId(id);
        return "redirect:/pesquisas";
    }
}   
