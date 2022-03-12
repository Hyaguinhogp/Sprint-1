package com.sprint1.hgp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cdUsuario;
	private String nome;
	private String email;
	private String dataNascimento;
	private String cpfCnpj;
	private String tipoLogin;
	private String cep;
	
	@ManyToOne
	@JoinTable(name = "tb_usuario_cidade", 
	joinColumns = @JoinColumn(name = "cdUsuario"),
	inverseJoinColumns = @JoinColumn(name = "Cidade_id"))
	private Cidade cidade;
	private String ddd;
	private String telefone;
	private String rendaMensal;
	
	public Usuario() {
	}

	public Usuario(Long cdUsuario, String nome, String email, String dataNascimento, String cpfCnpj, String tipoLogin,
			String cep, Cidade cidade, String ddd, String telefone, String rendaMensal) {
		this.cdUsuario = cdUsuario;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cpfCnpj = cpfCnpj;
		this.tipoLogin = tipoLogin;
		this.cep = cep;
		this.cidade = cidade;
		this.ddd = ddd;
		this.telefone = telefone;
		this.rendaMensal = rendaMensal;
	}

	public Long getCdUsuario() {
		return cdUsuario;
	}

	public void setCdUsuario(Long cdUsuario) {
		this.cdUsuario = cdUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getTipoLogin() {
		return tipoLogin;
	}

	public void setTipoLogin(String tipoLogin) {
		this.tipoLogin = tipoLogin;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(String rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	
}
