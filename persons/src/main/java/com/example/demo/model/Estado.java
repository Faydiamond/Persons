package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class Estado 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String estado;
	@ManyToOne
	@JoinColumn (name="id_pais")
	private Pais pais;
	
	public Estado(int id, String estado, Pais pais) {
		super();
		this.id = id;
		this.estado = estado;
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	////////////////////////////////
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
		
	}

	
	
	//////////////////////////////
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	//consytructor
	public Estado(String estado, Pais pais) {
		super();
		this.estado = estado;
		this.pais = pais;
	}
	
	public Estado() 
	{
		
	}
	
	
}
