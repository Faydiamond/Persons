package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pais;
import com.example.demo.repository.PaisRepository;

@Service
public class PaisService  implements PaisRepository
{
	@Autowired
	private PaisRepository paisrepo ;

	public List<Pais> findAll() 
	{
		// TODO Auto-generated method stub
		return paisrepo.findAll(); 
	}

	public List<Pais> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pais> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Pais> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Pais> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Pais> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAllInBatch(Iterable<Pais> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public Pais getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pais getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Pais> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Pais> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Pais> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Pais> findById(Long id) {
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
		
	}

	public void delete(Pais entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Pais> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Pais> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Pais> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Pais> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Pais> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
