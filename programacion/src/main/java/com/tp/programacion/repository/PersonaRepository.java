package com.tp.programacion.repository;

import com.tp.programacion.model.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends Neo4jRepository<Person, Long> {
}


