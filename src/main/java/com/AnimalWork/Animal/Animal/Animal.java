package com.AnimalWork.Animal.Animal;

import jakarta.persistence.*;


@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int animalID;
    @Column(nullable = false)
    private String name;
    private String origin;
    private int lifespan;
    private String description;


    public Animal(int animalID, String name, String origin, int lifespan, String description) {
        this.animalID = animalID;
        this.name = name;
        this.origin = origin;
        this.lifespan = lifespan;
        this.description = description;
    }

    public Animal() {
    }

    public int getanimalID() {
        return animalID;
    }

    public void setID(int animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getLifespan() {
        return lifespan;
    }


    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

