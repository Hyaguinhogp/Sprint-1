package com.sprint1.hgp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprint1.hgp.dtos.UsuarioDTO;
import com.sprint1.hgp.dtos.UsuarioUpdateDTO;
import com.sprint1.hgp.entities.Cidade;
import com.sprint1.hgp.entities.Usuario;
import com.sprint1.hgp.repositories.CidadeRepository;
import com.sprint1.hgp.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Transactional(readOnly = true)
	public UsuarioDTO findUserById(Long id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		return new UsuarioDTO(usuario);
	}
	
	@Transactional
	public UsuarioDTO insertUsuario(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		dtoToEntity(dto, usuario);
		
		Cidade cidadeDoUsuario = cidadeRepository.findByNomeCidade(dto.getCidade());
		usuario.setCidade(cidadeDoUsuario);
		
		usuarioRepository.save(usuario);
		
		return new UsuarioDTO(usuario);
	}
	
	@Transactional
	public UsuarioDTO updateUsuario(Long id, UsuarioUpdateDTO updateDto) {
		Usuario usuario = usuarioRepository.getOne(id);
		updateEntity(updateDto, usuario);
		
		Cidade cidadeDoUsuario = cidadeRepository.findByNomeCidade(updateDto.getCidade());
		usuario.setCidade(cidadeDoUsuario);
		
		usuarioRepository.save(usuario);
		
		return new UsuarioDTO(usuario);
	}
	
	@Transactional
	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	private void updateEntity(UsuarioUpdateDTO dto, Usuario usuario) {
		usuario.setEmail(dto.getEmail());
		usuario.setDdd(dto.getDdd());
		usuario.setTelefone(dto.getTelefone());
	}
	
	private void dtoToEntity(UsuarioDTO dto, Usuario usuario) {
		usuario.setCdUsuario(dto.getCdUsuario());
		usuario.setNome(dto.getNome());
		usuario.setEmail(dto.getEmail());
		usuario.setDataNascimento(dto.getDataNascimento());
		usuario.setCpfCnpj(dto.getCpfCnpj());
		usuario.setTipoLogin(dto.getTipoLogin());
		usuario.setCep(dto.getCep());
		usuario.setDdd(dto.getDdd());
		usuario.setTelefone(dto.getTelefone());
		usuario.setRendaMensal(dto.getRendaMensal());
	}
}
