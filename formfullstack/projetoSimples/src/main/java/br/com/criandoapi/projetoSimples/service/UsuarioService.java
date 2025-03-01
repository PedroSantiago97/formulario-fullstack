package br.com.criandoapi.projetoSimples.service;

import java.util.List;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.criandoapi.projetoSimples.model.Usuario;
import br.com.criandoapi.projetoSimples.repository.IUsuario;


@Service
public class UsuarioService {
	
	private IUsuario repository;
	private PasswordEncoder passwordEncoder;
	
	public UsuarioService(IUsuario repository) {
		this.repository = repository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public List<Usuario> listarUsuario(){
		List<Usuario> lista = repository.findAll();
		return lista;
	}
	
	public Usuario criarUsuario(Usuario usuario) {
		usuario.setSenha(this.passwordEncoder.encode(usuario.getSenha()));
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}

	public Usuario editarUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}
	
	public Boolean excluirUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}

	public Boolean validarSenha(Usuario usuario) {

		String senhaInformada = usuario.getSenha(); // Senha digitada pelo usuário (em texto simples)
		System.out.println(senhaInformada);
		String senhaCriptografada = repository.findById(usuario.getId())
		                                      .map(Usuario::getSenha)
		                                      .orElse(null); // O hash armazenado no banco de dados
		System.out.println(senhaCriptografada);
		boolean valid = passwordEncoder.matches(senhaInformada, senhaCriptografada); // Comparando a senha informada com o hash
		System.out.println(valid); // Verificando se a senha é válida
		return valid;
	}
 
}
