package br.com.generation.db_generation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.db_generation.model.CategoriaModel;

import br.com.generation.db_generation.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public ResponseEntity<List<CategoriaModel>> GetAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());
	}

	@GetMapping("/{id_categoria}")
	public ResponseEntity<CategoriaModel> GetById(@PathVariable long id_categoria) {
		return categoriaRepository.findById(id_categoria).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/tipo/{tipo}")
	public ResponseEntity<List<CategoriaModel>> GetByTipo(@PathVariable String tipo) {
		return ResponseEntity.ok(categoriaRepository.findAllByTipoContainingIgnoreCase(tipo));
	}

	@PostMapping
	public ResponseEntity<CategoriaModel> postCategoriaModel(@Valid @RequestBody CategoriaModel categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}

	@PutMapping
	public ResponseEntity<CategoriaModel> putCategoriaModel(@Valid @RequestBody CategoriaModel categoria) {
		return categoriaRepository.findById(categoria.getId()).map(resposta -> {
			return ResponseEntity.ok().body(categoriaRepository.save(categoria));
		}).orElse(ResponseEntity.notFound().build());

	}

	@DeleteMapping("/{id_categoria}")
	public ResponseEntity<?> repository(@PathVariable long id_categoria) {
		return categoriaRepository.findById(id_categoria).map(resp -> {
			categoriaRepository.deleteById(id_categoria);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}).orElse(ResponseEntity.notFound().build());

	}
}
