package com.tp.programacion.service;

import com.tp.programacion.model.Person;
import com.tp.programacion.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Person> obtenerTodas() {
        return personaRepository.findAll();
    }

    public Person guardar(Person persona) {
        return personaRepository.save(persona);
    }
}

