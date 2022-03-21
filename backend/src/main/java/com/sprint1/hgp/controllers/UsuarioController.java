package com.sprint1.hgp.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sprint1.hgp.dtos.UsuarioDTO;
import com.sprint1.hgp.dtos.UsuarioUpdateDTO;
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
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> insertUser(@Valid @RequestBody UsuarioDTO dto){
		dto = usuarioService.insertUsuario(dto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getCdUsuario()).toUri();
		
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTO> updateUsuario(@PathVariable Long id,
			@RequestBody UsuarioUpdateDTO updateDto){
		UsuarioDTO dto = usuarioService.updateUsuario(id, updateDto);
		
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTO> deleteUser(@PathVariable Long id){
		usuarioService.deleteUsuario(id);
		return ResponseEntity.noContent().build();
	}
}
