package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo) {
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}

	@PostMapping
	public ResponseEntity<Postagem> post(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}

	@PutMapping
	public ResponseEntity<Postagem> put(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}

/*
 * @RestController - informa para o spring que essa classe é uma controladora
 * 
 * @RequestMapping("/postagens") - definir a URI que essa classe sera acessada
 * (end-point) no caso acessado no postman de acordo com o parametro que foi
 * escrito, essa requisição vai passar a consumir esta classe
 * 
 * @CrossOrigin("*") - quando formos desenvolver o front - end e esse front-end
 * passar a consumir API que estamos fazendo o front end ira vir de outra origem
 * diferente pode ser de uma aplicação angular , ou de uma pagina escrita em
 * react, independente de qual origem que venha, nossa API tem que aceitar
 * (*)essa classe vai aceitar requisição de qualquer origem, liberação para que
 * ele seja consumido de qualquer origem
 * 
 * 
 * 
 * private PostagemRepository repository - primeira coisa : injetar o nosso
 * repositorio dentro do controle, e depois dar um nome (qualquer), por ser uma
 * interface não conseguimos instanciar esse comando
 * 
 * 
 * @Autowired - esse cara cuida da parte da instanciação dessa interface para o
 * spring utilizando essa anotação, garantindo o acesso de todos os serviços
 * oferecidos da interface a partir do controller, e injetamos do Autowired que
 * seria o serviço de injeção de dependencia do spring o nosso serviço postagem
 * repository
 * 
 * 
 * public ResponseEntity<List<Postagem>> GetAll() { return
 * ResponseEntity.ok(repository.findAll()); } - criamos o metodo findAll,
 * deixando ele publico, responseEntity<retornar uma lista<e essa lista vai ser
 * do tipo postagem>> o nome do metodo ser GetAll (não receberemos nada como
 * parametro) {
 * 
 * e no retorno desse metodo receberemos um objeto do tipo ResponseEntity
 * passando .ok que seria nossa resposta http(e dentro da bary nos vamos fazer a
 * requisição de todas as postagens, vamos chamar o 'repository'. e dentro dele
 * temos o metodo findAll ()); }
 * 
 * @GetMapping - que sempre quando vir alguma requisição externa, ou seja de
 * alguem que consuma essa API, atraves da URI ("/postagens") se o metodo dessa
 * requisição for um metodo GET ele dispara o metodo declarado
 * 
 */

/*
 * @GetMapping ("/{id}") -um novo tipo de busca como resposta pelo id, o usuario
 * vai escrever um parametro assim sendo uma requisição pelo id
 * 
 * 
 * public ResponseEntity<Postagem> GetById(@PathVariable long id) { return
 * repository.findById(id) .map(resp -> ResponseEntity.ok(resp))
 * .orElse(ResponseEntity.notFound().build());
 * 
 * @PathVariable - ela ajuda o metodo responseEntity<Postagem> a capturar o
 * valor indicado pelo @GetMatpping("/{id}") que seria a URI
 * 
 * return repository.finbyid pode retornar tanto umobjeto do tipo postagem com
 * um ok e um objeto dentro do corpo de requisição, ou um NOTFound caso o objeto
 * não exista ou caso exista algum erro na requisição
 */

/*
 * @GetMapping("/titulo/{titulo}") public ResponseEntity<List<Postagem>>
 * GetByTitulo(@PathVariable String titulo){ return
 * ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
 * 
 * @getMapping - estamos utilizando um subcaminho para não dar conflito com o
 * outro end-pont declarado que no caso foi o {id}
 * 
 * findAllByTituloContainingIgnoreCase(titulo) - busque tudo que estiver dentro
 * de titulo mesmo se for letra maiuscula ou minuscula *
 */

/*
 * @PostMapping public ResponseEntity<Postagem> post (@RequestBody Postagem
 * postagem) { return
 * ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
 * 
 * @ResquestBody - esta anotação consegue pegar o que veio no corpo da
 * requisição (Objeto Postagem)
 * 
 * (Postagem postagem) - o primeiro parametro seria um objeto do tipo Postagem,
 * e o segundo é o nome dele postagem
 * 
 * Postagem - é um objeto que contem varios atributos
 * 
 * 
 * responseEntity = não sera do tipo .ok que seria o 200, mas sim o 201 rated
 * para fazer isso escreva .status(HttpStatus.CREATED) para salvar na base de
 * dados (no body) faremos .body(chamaremos o repository chamandop o metodo
 * .save(chamando a entidade postagem que seria o que foi recebido pelo nosso
 * clint e passar como parametro desse metodo save )) , então criamos o nosso
 * end-point de postagem
 */

/*
 * @PutMapping public ResponseEntity<Postagem> put(@RequestBody Postagem
 * postagem) { return
 * ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem)); }
 * 
 * @PutMapping -ele vai retornar um objeto do tipo responseEntity e dentro dele
 * vai ter um recurso do tipo postagem, em seguida vai receber como parametro
 * viaBody (@RequestBody) um objeto do tipo postagem, e nós vamos devolver um
 * responseEntity com status de OK e dentro do corpo da requisição (ou body) nos
 * vamos passar o retorno desse metodo save e passar a postagem
 * 
 */

/*
 * @DeleteMapping("/{id}") public void delete (@PathVariable long id) {
 * repository.deleteById(id); }
 * 
 * @deleteMapping parecido com o @GetMapping = então é necessario escrever um
 * parametro, pois precisamos qual recurso devemos deletar , para delet sera
 * publico , o tipo sera void ou seja não vai retornar nada, nome do metodo
 * delete() e dentro do parenteses colocaremos os parametros @pathVariable que
 * pega o valor inserido no @deleteMapping declarando o dado do tipo long e nome
 * seria id conforme como esta no model, dentro da chave (não ira ter return por
 * ser uma void) , vamos chamar o repository e o metodo deleteById(e dentro do
 * pararenteses o id)
 * 
 * {id} = as chaves podemos chamar de interpolação ou template literal
 * 
 * 
 */
