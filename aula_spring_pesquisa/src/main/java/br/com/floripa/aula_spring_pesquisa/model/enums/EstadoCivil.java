package br.com.floripa.aula_spring_pesquisa.model.enums;

import lombok.Getter;
import lombok.Setter;

public enum EstadoCivil {
    
    CASADO("casado(a)"),
    SOLTEIRO ("Solteiro(a)"),
    VIUVO("Viuvo(a)"),
    DIVORCIADO("Divorciado(a)");

    @Getter @Setter
    private String descricao;

    EstadoCivil(String descricao){
        this.descricao = descricao;
    }

}