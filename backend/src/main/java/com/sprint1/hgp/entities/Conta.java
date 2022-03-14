package com.sprint1.hgp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConta;
	private String nmAgencia;
	private String cdConta;
	private String cdBanco;
	private Integer saldo;
	
	public Conta() {
	}

	public Conta(Long idConta, String nmAgencia, String cdConta, String cdBanco, Integer saldo) {
		this.idConta = idConta;
		this.nmAgencia = nmAgencia;
		this.cdConta = cdConta;
		this.cdBanco = cdBanco;
		this.saldo = saldo;
	}
	
	void pagar(Integer valor){
		saldo -= valor;
	}
	
	void depositar(Integer valor){
		saldo += valor;
	}
	
	void trasferir(Conta conta, Integer valor){
		pagar(valor);
		conta.depositar(valor);
	}
	
	void cobrar(Conta conta, Integer valor){
		conta.pagar(valor);
		depositar(valor);
	}

	public Long getIdConta() {
		return idConta;
	}

	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}

	public String getNmAgencia() {
		return nmAgencia;
	}

	public void setNmAgencia(String nmAgencia) {
		this.nmAgencia = nmAgencia;
	}

	public String getCdConta() {
		return cdConta;
	}

	public void setCdConta(String cdConta) {
		this.cdConta = cdConta;
	}

	public String getCdBanco() {
		return cdBanco;
	}

	public void setCdBanco(String cdBanco) {
		this.cdBanco = cdBanco;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
}
