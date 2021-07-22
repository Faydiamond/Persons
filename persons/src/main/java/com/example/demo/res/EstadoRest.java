package com.example.demo.res;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estado;
import com.example.demo.model.Pais;
import com.example.demo.service.EstadoService;

@RestController
@RequestMapping("/estados/")
public class EstadoRest 
{
	
	@Autowired
	private EstadoService estadoser;
	

	@GetMapping
	private ResponseEntity<List<Estado>> getAllStates()      //Pais del modleo
	{
		return ResponseEntity.ok(estadoser.findAll());												//variable del inyector
	}
	
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(estadoser.findAllByCountry(idPais));
		
	}
}
