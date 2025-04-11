package com.AnimalWork.Animal.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    // Fetch and return all Animals
    public Object getAllAnimals() {
        return animalRepository.findAll();
    }

    // Fetch and return unique Animal
//    public Object getAnimalsByID(int animalID) {
//        return animalRepository.getAnimalByID(animalID);
//    }

    public Animal getAnimalsByID(int animalID) {
        return animalRepository.getAnimalByID(animalID);
    }

    // Fetch and return Animal Name
    public List<Animal> getAnimalByName(String name) {
        return animalRepository.getAnimalByName(name);
    }

    // Fetch and return Animal origin
    public List<Animal> getAnimalByOrigin(String origin) {
        return animalRepository.getAnimalByOrigin(origin);
    }

    // Fetch and return Animal Lifespan
    public List<Animal> getAnimalByLifespan(int lifespan) {
        return animalRepository.getAnimalByLifespan(lifespan);
    }

    // Fetch and return Animal description
    public List<Animal> getAnimalByDescription(String description){
        return animalRepository.getAnimalByDescription(description);
    }

    // Add new Animal
    public Object addNewAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    //Remove an animal from the database
    public void removeAnimal(int animalID){
        animalRepository.deleteById(animalID);
    }

    // Update Animal
    public void updateAnimal(int animalID, Animal animal) {
        Animal existing = (Animal) getAnimalsByID(animalID);
        existing.setName(animal.getName());
        existing.setOrigin(animal.getOrigin());
        existing.setLifespan(animal.getLifespan());
        animalRepository.save(existing);
    }
}
