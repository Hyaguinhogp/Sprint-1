package com.sprint1.hgp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint1.hgp.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	public Cidade findByNomeCidade(String nomeCidade);
}
