package br.com.floripa.aula_spring_pesquisa.model.enums;

import lombok.Getter;
import lombok.Setter;

public enum GeneroFilme {

    FICCAO(1,"Ficção"),
    ACAO(2,"Ação"),
    TERROR(3,"Terror"),
    Romance(4,"Romance"),
    COMEDIA(5,"Comédia"),
    ANIMACAO(6,"Animacao");

    @Getter @Setter private int id;
    @Getter @Setter private String descricao;
    

    GeneroFilme( int id, String descricao){
        this.id =id;
        this.descricao = descricao;

    }
}
