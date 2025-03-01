package br.com.criandoapi.projetoSimples.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.com.criandoapi.projetoSimples.model.Usuario;


public interface IUsuario extends JpaRepository<Usuario, Integer>{


}
