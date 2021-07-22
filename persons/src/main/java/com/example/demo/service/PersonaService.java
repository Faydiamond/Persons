package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService implements PersonaRepository
{
	@Autowired
	private PersonaRepository personrepo ;

	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return personrepo.findAll();
	}

	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Persona> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Persona> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAllInBatch(Iterable<Persona> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public Persona getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Persona getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Persona> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Persona> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Persona> S save(S entity) {
		// TODO Auto-generated method stub
		//	return null;
		return personrepo.save(entity);
	}

	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personrepo.deleteById(id);
		
	}

	public void delete(Persona entity) {
		// TODO Auto-generated method stub
		personrepo.delete(entity);
		
	}

	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Persona> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Persona> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Persona> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Persona> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
