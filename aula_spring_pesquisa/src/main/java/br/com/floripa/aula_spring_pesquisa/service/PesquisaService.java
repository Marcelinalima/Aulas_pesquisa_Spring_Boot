package br.com.floripa.aula_spring_pesquisa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.floripa.aula_spring_pesquisa.exceptions.ObjetoNaoEncontradoException;
import br.com.floripa.aula_spring_pesquisa.model.dto.PesquisaDto;
import br.com.floripa.aula_spring_pesquisa.model.dto.PesquisaInserirDto;
import br.com.floripa.aula_spring_pesquisa.model.dto.PesquisaListaDTO;
import br.com.floripa.aula_spring_pesquisa.model.entidades.Pesquisa;
import br.com.floripa.aula_spring_pesquisa.repository.PesquisaRepository;
import lombok.Getter;

@Service
public class PesquisaService {
    
    @Autowired
    @Getter
    private PesquisaRepository repository;

    public PesquisaDto salvar(PesquisaInserirDto pesquisaDto){
        Pesquisa pesquisa = dto2PesquisaBuilder(pesquisaDto);
        pesquisa = getRepository().save(pesquisa);
        return pesquisa2PesquisaDtoBuilder(pesquisa);

    }
        public List<PesquisaListaDTO> findAll() {
        return listaPesquisa2ListaPesquisaListaDTO(repository.findAll());
    }

   
    private Pesquisa dto2PesquisaBuilder(PesquisaInserirDto pesquisaInserirDto){
       return  Pesquisa.builder()
        .id(pesquisaInserirDto.getId())
        .nome(pesquisaInserirDto.getNome())
        .email(pesquisaInserirDto.getEmail())
        .sexo(pesquisaInserirDto.getSexo())
        .estadoCivil(pesquisaInserirDto.getEstadoCivil())
        .generosFilme(pesquisaInserirDto.getGenerosFilme())
        .build();
        
    }    
        
    private PesquisaDto pesquisa2PesquisaDtoBuilder(Pesquisa pesquisa){
    return PesquisaDto.builder()
        .id(pesquisa.getId())
        .nome(pesquisa.getNome())
        .email(pesquisa.getEmail())
        .sexo(pesquisa.getSexo())
        .estadoCivil(pesquisa.getEstadoCivil())
        .generosFilme(pesquisa.getGenerosFilme())
        .build();

    }
    private List<PesquisaListaDTO> listaPesquisa2ListaPesquisaListaDTO(List<Pesquisa> pesquisas) {
             return pesquisas.stream().map(pesquisa -> new PesquisaListaDTO(pesquisa.getId(), pesquisa.getNome(),
                pesquisa.getSexo(), pesquisa.getEstadoCivil(), pesquisa.getGenerosFilme()))
                .collect(Collectors.toList());

    }
     public void removerPeloId(Long id) {
        repository.deleteById(id);
    }
    public Pesquisa procurarPeloId(Long id) throws ObjetoNaoEncontradoException {
        return repository.findById(id).orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado no banco de dados"));
    }
     
}