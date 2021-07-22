package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="person")
public class Persona 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nameOne;	
	private String nameTwo;
	private String lanaOne;
	private String lanaTwo;
	private int age;

	
	
	//constturctor
	public Persona(String nameOne, String nameTwo, String lanaOne, String lanaTwo, int age, Pais pais, Estado estado) {
		super();
		this.nameOne = nameOne;
		this.nameTwo = nameTwo;
		this.lanaOne = lanaOne;
		this.lanaTwo = lanaTwo;
		this.age = age;
		
	}
	
	public Persona() {
	
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameOne() {
		return nameOne;
	}
	public void setNameOne(String nameOne) {
		this.nameOne = nameOne;
	}
	public String getNameTwo() {
		return nameTwo;
	}
	public void setNameTwo(String nameTwo) {
		this.nameTwo = nameTwo;
	}
	public String getLanaOne() {
		return lanaOne;
	}
	public void setLanaOne(String lanaOne) {
		this.lanaOne = lanaOne;
	}
	public String getLanaTwo() {
		return lanaTwo;
	}
	public void setLanaTwo(String lanaTwo) {
		this.lanaTwo = lanaTwo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
