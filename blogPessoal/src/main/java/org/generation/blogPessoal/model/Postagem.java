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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "postagem") // que atraves dessa anotação que essa entidade dentro do banco de dados ela vai
							// virar uma tabela estou declarando o nome da tabela
public class Postagem {

	@Id // declarando que o atributo abaixo atraves da anotation é uma ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // como esse ID vai se comportar dentro da base de dados, ele
														// sera gerado, e aplicando o parametro strategy =
														// generationType.identity para declarar esse atributo como
														// chave primaria
	private long id;

	@NotNull // que não pode vir nenhum titulo vazio
	@Size(min = 5, max = 100, message = "O atributo texto deve conter no mínimo 10 caracteres") // determinando a qtd de
																								// caracteres o minimo e
																								// o maximo
	private String titulo;

	@NotNull
	@Size(min = 10, max = 500, message = "O atributo texto deve conter no minimo 10 caracteres") // determinando a qtd
																									// de caracteres o
																									// minimo e o maximo
	private String texto;

	// @UpdateTimestamp
	// private LocalDate data;

	// indica que estamos trabalhando com o tempo para o atributo abaixo
	// este comando serve para quando o usuario
	// digitar um dado ele mostra o horario da
	// postagem inserido
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	// Nesta parte da anotação @JsonIgnoreProperties vamos passar como parametro a
	// propriedadade que foi declarado na classe tema, que seria postagem, ele para
	// de apresentar informação
	@JsonIgnoreProperties("postagem")
	private Tema tema;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
}
