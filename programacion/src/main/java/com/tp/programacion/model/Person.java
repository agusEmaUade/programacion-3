package com.tp.programacion.model;


import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Person") // Define un nodo en Neo4j
public class Person {

    @Id
    @GeneratedValue
    private Long id; // ID autogenerado en la BD

    private String name;
    private Long born;

    public Person(String name, Long born) {
        this.name = name;
        this.born = born;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getBorn() {
        return born;
    }
}


