package com.apiPersonaDemo.service;

import com.apiPersonaDemo.dao.PersonaDao;
import com.apiPersonaDemo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImp implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly = false )
    public Persona save(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        personaDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findById(Integer id) {
        return  personaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }
}
