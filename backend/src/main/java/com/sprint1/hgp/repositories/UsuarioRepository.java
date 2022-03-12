package com.sprint1.hgp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint1.hgp.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
