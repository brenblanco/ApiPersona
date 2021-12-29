package com.apiPersonaDemo.dao;

import com.apiPersonaDemo.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Integer> {

}
