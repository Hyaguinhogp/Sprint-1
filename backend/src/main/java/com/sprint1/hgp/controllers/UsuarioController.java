package com.sprint1.hgp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.hgp.dtos.UsuarioDTO;
import com.sprint1.hgp.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTO> findUsuarioById(@PathVariable Long id){
		UsuarioDTO dto = usuarioService.findUserById(id);
		return ResponseEntity.ok().body(dto);
	}
}
