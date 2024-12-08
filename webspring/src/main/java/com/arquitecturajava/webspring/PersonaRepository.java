package com.arquitecturajava.webspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.arquitecturajava.webspring.models.Persona;

@Component
public class PersonaRepository {

	private List <Persona> personas = new ArrayList <Persona>();
	
	public PersonaRepository () {
		personas.add(new Persona("Borja"));
	}
	
	public void add (Persona persona) {
		personas.add(persona);
	}
	
	public List <Persona> buscarTodos () {
		return personas;
	}
	
}
