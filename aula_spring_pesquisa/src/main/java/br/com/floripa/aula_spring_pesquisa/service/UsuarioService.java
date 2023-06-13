package br.com.floripa.aula_spring_pesquisa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.floripa.aula_spring_pesquisa.model.dto.UsuarioConsultaDTO;
import br.com.floripa.aula_spring_pesquisa.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

     public List<UsuarioConsultaDTO> findAll(){
        List<UsuarioConsultaDTO> dtos = repository.findAll()
            .stream()
            .map( u -> new UsuarioConsultaDTO(u.getId(), u.getNome()))
            .collect(Collectors.toList());
        
        return dtos;
    }
    
    
}