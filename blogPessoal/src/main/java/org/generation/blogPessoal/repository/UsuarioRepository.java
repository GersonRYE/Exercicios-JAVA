package org.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
	/**
	 * Método que busca um usuário pelo seu usuario (email).
	 * 
	 * select * from tb_usuarios where usuario = "usuario procurado"
	 */
	public Optional<UsuarioModel> findByUsuario(String usuario);

	/** 
	 * Usaremos na Sessão de Testes
	 * 
	 * select * from tb_usuarios where nome like "%nome procurado%"
	 */
	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String nome);

}
