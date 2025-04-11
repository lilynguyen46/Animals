package com.AnimalWork.Animal.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    Animal getAnimalByID(int animalID);

    List<Animal> getAnimalByName(String name);

    List<Animal> getAnimalByOrigin(String origin);

    List<Animal> getAnimalByLifespan(int lifespan);

    List<Animal> getAnimalByDescription(String description);
}

