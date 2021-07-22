package com.example.demo.res;

import java.util.List;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping("/personas/")
public class PersonRest {

	// inyectar propiedad
	@Autowired
	private PersonaService personaservice;
	// listar todos:

	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersona() {
		return ResponseEntity.ok(personaservice.findAll());
	}

	// Guardar
	@PostMapping
	private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
		try {
			Persona personaGuardada = personaservice.save(persona);
			return ResponseEntity.created(new URI("/personas/" + personaGuardada.getId())).body(personaGuardada);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}
	
	@DeleteMapping(value="delete/{id}")
	private ResponseEntity<Boolean> deletePerson(@PathVariable("id") long id)
	{
		personaservice.deleteById(id);
		return ResponseEntity.ok( !(personaservice.findById(id)!= null));  //no lo encuentra false
	}	 
}
