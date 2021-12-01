package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}

/*
 * Estamos herdando da interface JpaRepository com os parametros que seriam o
 * tipo de entidade que estamos trabalhando, e qual o tipo de ID ou seja qual a
 * tipagem do ID o id que estamos utilizando como chave primary da nossa classe
 * e Long do tipo primitivo
 */

/*
 * @Repository essa anotação indica para o spring que essa classe se trata de
 * uma classe repositorio, o Jparepository se trata de uma outra interface que
 * existe diversos contratos dentre eles temos um findAll(selecionar tudo),
 * findById(Selecionar um dados pelo ID), Save(para salvar), Delete(para
 * deletar)
 */

/*
 * public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo) Jpa
 * Hibernate é uma interface que ja vem com alguns contratos que da para fazer
 * manipulações dentro do banco de dados, porem existe algumas alteraçãoes que
 * não existem dentro dessa interface, ex.: CarryMethods nos vamos utilizar esse
 * conceito para fazer consultas padronizadas ou seja nossas consultas que nos
 * mesmos iremos construir
 */

/*
 * public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo)
 * busca pelo titulo(traz todos que tiverem esse atributo titulo) mas não o titulo exato
 * e sim o que contém dentro dele, sem levar em consideração letra maiuscula ou
 * minuscula
 * 
 * 
 * findAll = buscar todos
 * 
 * by = pelo
 * 
 * Titulo = nome do atributo da minha entidade(mesmo declarando em letra
 * maiuscula(camel case) o JAVA consegue entender que esta no model atributo
 * titulo
 * 
 * Containing = Like no Mysql, ele busca tudo que tiver dentro parametro que foi
 * declarado em String, mas nesse caso buscar tudo que tiver dentro do atributo
 * titulo
 * 
 * IgnoreCase = utilizado para não levar em consideração o maiusculo e minusculo
 * ou seja pega tudo padronizando em minusculo e vai fazer a busca do parametro
 * declarado com os dados que contem dentro dele e sem levar em consideração
 * maiusculo e minusculo
 * 
 */
