package br.com.floripa.aula_spring_pesquisa.model.entidades;

import java.util.ArrayList;
import java.util.List;

import br.com.floripa.aula_spring_pesquisa.model.enums.GeneroFilmes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Pesquisa{

    @EqualsAndHashCode.Include 
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

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
    private String estadoCivil;  

    
    /**
     *
     *
     */
    @Getter
    @Setter
    private List<GeneroFilmes> generosFilme = new ArrayList<>();


    public Pesquisa() {
    }


    public Pesquisa(Long id, String nome, String email, String sexo, String estadoCivil,
            List<GeneroFilmes> generosFilme) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.generosFilme = generosFilme;
    }


    @Override
    public String toString() {
        return "Pesquisa [id=" + id + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo + ", estadoCivil="
                + estadoCivil + ", generosFilme=" + generosFilme + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pesquisa other = (Pesquisa) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (sexo == null) {
            if (other.sexo != null)
                return false;
        } else if (!sexo.equals(other.sexo))
            return false;
        if (estadoCivil == null) {
            if (other.estadoCivil != null)
                return false;
        } else if (!estadoCivil.equals(other.estadoCivil))
            return false;
        if (generosFilme == null) {
            if (other.generosFilme != null)
                return false;
        } else if (!generosFilme.equals(other.generosFilme))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
        result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
        result = prime * result + ((generosFilme == null) ? 0 : generosFilme.hashCode());
        return result;
    }

	

}