package com.sprint1.hgp.dtos;

import java.io.Serializable;

public class UsuarioUpdateDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String ddd;
	private String telefone;
	private String cidade;
	private String email;
	
	public UsuarioUpdateDTO() {
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
