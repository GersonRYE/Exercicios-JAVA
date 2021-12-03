package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	// de acordo com que o cliente digitar, vai pegar tudo que contem aquela palavra
	// que digitou e vai ignorar se for letra maiuscula ou minuscula
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
