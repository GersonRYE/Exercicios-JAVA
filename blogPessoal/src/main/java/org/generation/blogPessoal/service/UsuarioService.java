package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;
import org.generation.blogPessoal.model.UsuarioLogin;
import org.generation.blogPessoal.model.UsuarioModel;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *  A Classe UsuarioService implementa as regras de negócio do Usuario.
 *  
 *  Regras de negócio são as particularidades das funcionalidades a serem 
 *  implementadas no objeto, tais como:
 *  
 *  1) O Usuário não pode estar duplicado no Banco de dados
 *  2) O Usuario deve ser maior de 18 anos
 *  
 *  Observe que toda a implementação dos metodos Cadastrar, Atualizar e 
 *  Logar estão implmentadas na classe de serviço, enquanto a Classe
 *  Controller se limitará a checar se deu certo ou errado a requisição.
 */

 /**
 * A annotation @Service indica que esta é uma Classe de Serviço, ou seja,
 * implementa regras de negócio da aplicação
 */

@Service
public class UsuarioService {


	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional<UsuarioModel> cadastrarUsuario(UsuarioModel usuario) {

		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			return Optional.empty();
		
		usuario.setSenha(criptografarSenha(usuario.getSenha()));

		return Optional.of(usuarioRepository.save(usuario));
	
	}

	public Optional<UsuarioModel> atualizarUsuario(UsuarioModel usuario) {

		if (usuarioRepository.findById(usuario.getId()).isPresent()) {
			
			Optional<UsuarioModel> buscaUsuario = usuarioRepository.findByUsuario(usuario.getUsuario());

			if (buscaUsuario.isPresent()) {				
				if (buscaUsuario.get().getId() != usuario.getId())
					return Optional.empty();
			}
			
			usuario.setSenha(criptografarSenha(usuario.getSenha()));

			return Optional.of(usuarioRepository.save(usuario));
		} 
			
		return Optional.empty();
	}	

	public Optional<UsuarioLogin> autenticarUsuario(Optional<UsuarioLogin> usuarioLogin) {

		Optional<UsuarioModel> usuario = usuarioRepository.findByUsuario(usuarioLogin.get().getUsuario());

		if (usuario.isPresent()) {
			if (compararSenhas(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {

				usuarioLogin.get().setId(usuario.get().getId());				
				usuarioLogin.get().setNome(usuario.get().getNome());
				usuarioLogin.get().setSenha(usuario.get().getSenha());
				usuarioLogin.get().setToken(gerarBasicToken(usuarioLogin.get().getUsuario(), usuarioLogin.get().getSenha()));

				return usuarioLogin;

			}
		}	
		
		return Optional.empty();
		
	}

	private String criptografarSenha(String senha) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(senha);

	}
	
	private boolean compararSenhas(String senhaDigitada, String senhaBanco) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.matches(senhaDigitada, senhaBanco);

	}

	private String gerarBasicToken(String email, String password) {
		
		String tokenBase = email + ":" + password;
		byte[] tokenBase64 = Base64.encodeBase64(tokenBase.getBytes(Charset.forName("US-ASCII")));
		return "Basic " + new String(tokenBase64);

	}

}