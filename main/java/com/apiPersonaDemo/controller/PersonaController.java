package com.apiPersonaDemo.controller;

import com.apiPersonaDemo.model.Persona;
import com.apiPersonaDemo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/personas")
    public Persona save(@RequestBody Persona persona){
        return personaService.save(persona);
    }

    @GetMapping("/personas")
    public List<Persona> personas(){
        return personaService.findAll();
    };

    @GetMapping("/personas/{id}")
    public Persona mostrar(@PathVariable Integer id){
        return personaService.findById(id);
    }

    @PutMapping("/personas/{id}")
    public Persona update(@RequestBody Persona persona, @PathVariable Integer id){
        Persona personaActual = personaService.findById(id);
        personaActual.setName(persona.getName());
        personaActual.setLastName(persona.getLastName());
        personaActual.setDni(persona.getDni());
        personaActual.setEmployee(persona.isEmployee());

        return personaService.save(personaActual);
    }

    @DeleteMapping("/persona/{id}")
    public void delete(@PathVariable Integer id){
        personaService.delete(id);
    }
}
