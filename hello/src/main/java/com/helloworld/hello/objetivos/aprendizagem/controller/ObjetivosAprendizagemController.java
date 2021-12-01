package com.helloworld.hello.objetivos.aprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // definimos que esssa classe é um controle
@RequestMapping("/objap") /* qual o caminho que sera usado no postman para acessar esse ponto de acesso no
							 caso o controller.
						 */
public class ObjetivosAprendizagemController {

	@GetMapping
	public String objetivosAprendizagem() {
		return "Estudar Lógica, Mysql e Spring-boot";
	}

}
