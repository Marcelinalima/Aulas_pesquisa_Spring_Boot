package br.com.floripa.aula_spring_pesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.floripa.aula_spring_pesquisa.model.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}



