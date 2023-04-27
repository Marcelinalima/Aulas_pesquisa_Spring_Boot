package br.com.floripa.aula_spring_pesquisa.model.entidades;

import java.util.ArrayList;
import java.util.List;

import br.com.floripa.aula_spring_pesquisa.model.enums.EstadoCivil;
import br.com.floripa.aula_spring_pesquisa.model.enums.GeneroFilmes;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Pesquisa{
    @EqualsAndHashCode.Include 
    @Getter
    private Integer id;

    @Getter 
    @Setter
     private String nome;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String sexo;

    @Getter
    @Setter
    private  EstadoCivil estadoCivil;  

    @Getter
    @Setter
    private List<GeneroFilmes>generosFilme = new ArrayList<>();

}