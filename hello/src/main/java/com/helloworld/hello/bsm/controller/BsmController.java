package com.helloworld.hello.bsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {
	@GetMapping
	public String bsm() {
		return "Habilidades usadas para esse exercício RESPONSABILIDADE PESSOAL e PERSISTÊNCIA e um pouquinho de MENTALIDADE DE CRESCIMENTO...";
	}
}
