package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

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

	@NotBlank(message="É obrigatório ter algo escrito")
	private String descricao;

	// mappedBy - qual atributo estamos mapeando da tabela de postagem , e outro
	// atributo
	// cascade do tipo
	// cascadeType. ALL - significa qualquer alteração a esse tema feito, sera feita
	// alteração em todos referente a esse tema
	
	//@NotBlank(message = "O Atributo descrição não pode estar , e nem espaço em vazio") // blank utilizado para String
	//@NotNull
	//@NotEmpty
	// @JsonIgnoreProperties - para de mostrar infomração quando chegar no atributo
		// tema na classe postagem
		// quando encontrar a informação ali dentro de tema, ele apresenta e encerra o resultado
	@JsonIgnoreProperties("tb_tema")
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
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
