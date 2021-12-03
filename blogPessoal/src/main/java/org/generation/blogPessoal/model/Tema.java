package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_tema")
public class Tema {

	// Esta anotação declara que este atributo é uma chave primaria
	@Id
	// Esta anotação declara que este atributo tipo long é auto-increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String descricao;

	// mappedBy - qual atributo estamos mapeando da tabela de postagem , e outro
	// atributo
	// cascade do tipo
	// cascadeType. ALL - significa qualquer alteração a esse tema feito, sera feita
	// alteração em todos referente a esse tema
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	// @JsonIgnoreProperties - para de mostrar infomração quando chegar no atributo
	// tema na classe postagem
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
