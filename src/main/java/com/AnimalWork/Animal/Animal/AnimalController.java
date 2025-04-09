package com.AnimalWork.Animal.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService service;

    @GetMapping("/all")
    public Object getAllAnimals() {
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
    }

    @GetMapping("/{animalID}")
    public Object getOneAnimal(@PathVariable int animalID) {
        return new ResponseEntity<>(service.getAnimalsByID(animalID), HttpStatus.OK);
    }

    // http://localhost:8080/animals/name?search=Tiger
    @GetMapping("/name")
    public Object getAnimalByName(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getAnimalByName(search), HttpStatus.OK);
    }

    @GetMapping("/animalorigin")
    public Object getAnimalByOrigin(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getAnimalByOrigin(search), HttpStatus.OK);
    }

    @GetMapping("/lifespan/{animalID}")
    public Object getAnimalByLifespan(@PathVariable int animalID) {
        return new ResponseEntity<>(service.getAnimalByLifespan(animalID), HttpStatus.OK);
    }

    @GetMapping("/description")
    public Object getAnimalByDescription(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getAnimalByDescription(search), HttpStatus.OK);
    }

    @PostMapping("/new")
    public Object addNewAnimal(@RequestBody Animal animal) {
        service.addNewAnimal(animal);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.CREATED);
    }

    @PutMapping("/update/{animalID}")
    public Object updateAnimal(@PathVariable int animalID, @RequestBody Animal animal) {
        service.updateAnimal(animalID, animal);
        return new ResponseEntity<>(service.getAnimalsByID(animalID), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{animalID}")
    public Object deleteAnimalById(@PathVariable int animalID) {
        service.removeAnimal(animalID);
        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
    }
}

