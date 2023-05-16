package br.com.criandoapi.youtube.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.criandoapi.youtube.projeto.model.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario,Integer>{

}
