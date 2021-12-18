package org.generation.blogPessoal.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	   

@Entity
@Table(name = "tb_postagem") // que atraves dessa anotação que essa entidade dentro do banco de dados ela vai
							// virar uma tabela estou declarando o nome da tabela
public class PostagemModel {

	@Id // declarando que o atributo abaixo atraves da anotation é uma ID
	// como esse ID vai se comportar dentro da base de dados, ele
	// sera gerado, e aplicando o parametro strategy =
	// generationType.identity para declarar esse atributo como
	// chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long id;

	@NotBlank // que não pode vir nenhum titulo vazio
	// determinando a qtd de
	// caracteres o minimo e
	// o maximo
	//@Size(min = 5, message = "O atributo texto deve conter no mínimo 10 caracteres") 
	private String titulo;

	@NotBlank
	// determinando a qtd
	// de caracteres o
	// minimo e o maximo
	//@Size(min = 10, message = "O atributo texto deve conter no minimo 10 caracteres") 
	private String texto;

	// @UpdateTimestamp
	// private LocalDate data;

	// indica que estamos trabalhando com o tempo para o atributo abaixo
	// este comando serve para quando o usuario
	// digitar um dado ele mostra o horario da
	// postagem inserido
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	
	@ManyToOne
	// Nesta parte da anotação @JsonIgnoreProperties vamos passar como parametro a
	// propriedadade que foi declarado na classe tema, que seria postagem, ele apresenta
	// uma vez a informação e encerra a resposta
	@JsonIgnoreProperties("postagem")
	private TemaModel tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private UsuarioModel usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TemaModel getTema() {
		return tema;
	}

	public void setTema(TemaModel tema) {
		this.tema = tema;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	
	
}
