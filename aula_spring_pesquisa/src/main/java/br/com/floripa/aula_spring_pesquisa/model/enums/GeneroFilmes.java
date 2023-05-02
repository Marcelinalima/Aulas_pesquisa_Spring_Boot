package br.com.floripa.aula_spring_pesquisa.model.enums;

import lombok.Getter;
import lombok.Setter;

public enum GeneroFilmes {

    FICCAO("Ficção"),
    ACAO("Ação"),
    TERROR("Terror"),
    ROMANCE("Romance"),
    COMEDIA("Comédia"),
    ANIMACAO("Animacao");

    @Getter @Setter
    private String descricao;
    
    GeneroFilmes(String descricao){
        this.descricao = descricao;
    }

    
}
