package br.com.criandoapi.projetoSimples.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


import lombok.*;


@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Size(min = 3, message = "O nome precisa de no mínimo 3 Caracteres")
	@NotBlank(message = "O nome é Obrigatório!")
	@Column(name = "nome", length = 200, nullable = true)
	private String nome;
	
	@Email
	@NotBlank(message = "O Email é Obrigatório!")
	@Column(name = "email", length = 50, nullable = true)
	private String email;
	
	@NotBlank(message = "A Senha é Obrigatório!")
	@Column(name = "senha", columnDefinition = "TEXT", nullable = true)
	@Size(min = 8, message = "A senha precisa ter no mínimo 8 caracteres")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$", 
	    message = "A senha deve conter pelo menos uma letra maiúscula, uma minúscula, um número e um caractere especial")
	private String senha;
	
	@NotBlank(message = "O Telefone é Obrigatório!")
	@Column(name = "telefone", length = 15 , nullable = true)
	private String telefone;

}
