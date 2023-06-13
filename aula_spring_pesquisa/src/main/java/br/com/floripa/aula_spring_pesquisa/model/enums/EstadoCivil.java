package br.com.floripa.aula_spring_pesquisa.model.enums;

import lombok.Getter;


public enum EstadoCivil {
    
    CASADO("casado(a)"),
    SOLTEIRO ("Solteiro(a)"),
    VIUVO("Viuvo(a)"),
    DIVORCIADO("Divorciado(a)");

    @Getter
    private String descricao;

    EstadoCivil(String descricao){
        this.descricao = descricao;
    }

}