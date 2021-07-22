package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Persona;
import com.sun.xml.bind.v2.model.core.ID;

public interface PersonaRepository  extends JpaRepository<Persona, Long>    //jpar +control space
{

}
