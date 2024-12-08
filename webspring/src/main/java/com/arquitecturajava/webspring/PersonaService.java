package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arquitecturajava.webspring.dtos.PersonaDto;
import com.arquitecturajava.webspring.dtos.mappers.PersonaMapper;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository repositorio;
	
	public void add (PersonaDto personaDto) {
		repositorio.add(PersonaMapper.toBo(personaDto));
	}
	
	public List <PersonaDto> buscarTodos () {
		return repositorio.buscarTodos().stream().map((p)->new PersonaDto(p.getNombre().toUpperCase())).toList();
	}

}
