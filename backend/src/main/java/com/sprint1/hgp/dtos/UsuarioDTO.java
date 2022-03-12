package com.sprint1.hgp.dtos;

import com.sprint1.hgp.entities.Usuario;

public class UsuarioDTO {

	private Long cdUsuario;
	private String nome;
	private String email;
	private String dataNascimento;
	private String cpfCnpj;
	private String tipoLogin;
	private String cep;
	private String cidade;
	private String ddd;
	private String telefone;
	private String rendaMensal;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long cdUsuario, String nome, String email, String dataNascimento, String cpfCnpj,
			String tipoLogin, String cep, String cidade, String ddd, String telefone, String rendaMensal) {
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
	
	public UsuarioDTO(Usuario usuario) {
		this.cdUsuario = usuario.getCdUsuario();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.dataNascimento = usuario.getDataNascimento();
		this.cpfCnpj = usuario.getCpfCnpj();
		this.tipoLogin = usuario.getTipoLogin();
		this.cep = usuario.getCep();
		this.cidade = usuario.getCidade();
		this.ddd = usuario.getDdd();
		this.telefone = usuario.getTelefone();
		this.rendaMensal = usuario.getRendaMensal();
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
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
