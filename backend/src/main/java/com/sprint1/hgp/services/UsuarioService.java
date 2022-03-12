package com.sprint1.hgp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprint1.hgp.dtos.UsuarioDTO;
import com.sprint1.hgp.entities.Usuario;
import com.sprint1.hgp.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	public UsuarioDTO findUserById(Long id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		return new UsuarioDTO(usuario);
	}
}
