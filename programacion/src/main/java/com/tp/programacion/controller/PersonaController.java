package com.tp.programacion.controller;

import com.tp.programacion.model.Person;
import com.tp.programacion.service.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Person> obtenerTodas() {
        return personaService.obtenerTodas();
    }


    @PostMapping
    public Person guardar(@RequestBody Person persona) {
        return personaService.guardar(persona);
    }
}
