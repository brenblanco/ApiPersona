package com.apiPersonaDemo.service;

import com.apiPersonaDemo.model.Persona;

import java.util.List;

public interface PersonaService {

    public Persona save(Persona persona);

    public void delete(Integer id);

    public Persona findById(Integer id);

    public List<Persona> findAll();
}
