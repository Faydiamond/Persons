package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Estado;
import com.example.demo.repository.EstadoRepository;

@Service
public class EstadoService  implements EstadoRepository
{
	//llamo al repositorio, lo defino despyes lo implemento
	@Autowired		 												//inyeccion
	private EstadoRepository estadorepo ;

	public List<Estado> findAll() {
		// TODO Auto-generated method stub
		return estadorepo.findAll();
	}
	
	public List<Estado> findAllByCountry(long id) 
	{
		System.out.println("aqui " +id);
		List<Estado> estadosRes = new ArrayList<Estado>();
		List<Estado> estados = estadorepo.findAll();   //me traigo los estados que existen
		for(int i=0; i < estados.size();i++)
		{
			if(estados.get(i).getPais().getId() == id )
			{
				estadosRes.add(estados.get(i)); 				//cumplen con la condicion
				System.out.println(estadosRes);
			}
		}
		return estadosRes;
	}
	
	

	public List<Estado> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return estadorepo.findAll(sort);
	}

	public List<Estado> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Estado> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAllInBatch(Iterable<Estado> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public Estado getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Estado getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Estado> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Estado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Estado> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Estado> findById(Long id) {
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

	public void delete(Estado entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Estado> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public <S extends Estado> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Estado> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Estado> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
