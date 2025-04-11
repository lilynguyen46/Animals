package com.AnimalWork.Animal.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService service;

    // Get all animals
    // http://localhost:8080/animals/all

//    @GetMapping("/all")
//    public Object getAllAnimals() {
//        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
//    }

    @GetMapping("/all")
    public Object getAllAnimals(Model model) {
        model.addAttribute("animalList", service.getAllAnimals());
        model.addAttribute("title", "All Animals");
        return "animal-list";
    }

    // Get animals by id
    // http://localhost:8080/animals/1

//    @GetMapping("/{animalID}")
//    public Object getOneAnimal(@PathVariable int animalID) {
//        return new ResponseEntity<>(service.getAnimalsByID(animalID), HttpStatus.OK);
//    }


    @GetMapping("/{animalID}")
    public Object getOneAnimal(@PathVariable int animalID, Model model) {
        model.addAttribute("animal", service.getAnimalsByID(animalID));
        model.addAttribute("title", "Animal #: " + animalID);
        return "animal-details";
    }


    // Get animal by name
    // http://localhost:8080/animals/name?search=Tiger
//    @GetMapping("/name")
//    public Object getAnimalByName(@RequestParam(name = "search", defaultValue = "") String search) {
//        return new ResponseEntity<>(service.getAnimalByName(search), HttpStatus.OK);
//    }


    @GetMapping("/name")
    public Object getAnimalByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        model.addAttribute("animalList", service.getAnimalByName(search));
        model.addAttribute("title", "Animal by Name: " + search);
        return "animal-list";
    }


    // Get animal by origin
//    @GetMapping("/animalorigin")
//    public Object getAnimalByOrigin(@RequestParam(name = "search", defaultValue = "") String search) {
//        return new ResponseEntity<>(service.getAnimalByOrigin(search), HttpStatus.OK);
//    }

    @GetMapping("/origin/{origin}")
    public Object getAnimalByOrigin(@PathVariable String origin, Model model) {
        model.addAttribute("animalList", service.getAnimalByOrigin(origin));
        model.addAttribute("title", "Animals by Origin: " + origin);
        return "animal-list";
    }


    // Get animal by lifespan
//    @GetMapping("/lifespan/{lifespan}")
//    public Object getAnimalByLifespan(@PathVariable int lifespan) {
//        return new ResponseEntity<>(service.getAnimalByLifespan(lifespan), HttpStatus.OK);
//    }

    @GetMapping("/lifespan/{lifespan}")
    public Object getAnimalByLifespan(@PathVariable int lifespan, Model model) {
        model.addAttribute("animalList", service.getAnimalByLifespan(lifespan));
        model.addAttribute("title", "Animals by Lifespan: " + lifespan);
        return "animal-list";
    }


    // Get animal by description
//    @GetMapping("/description")
//    public Object getAnimalByDescription(@RequestParam(name = "search", defaultValue = "") String search) {
//        return new ResponseEntity<>(service.getAnimalByDescription(search), HttpStatus.OK);
//    }

    @GetMapping("/description")
    public Object getAnimalByDescription(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        model.addAttribute("animalList", service.getAnimalByDescription(search));
        model.addAttribute("title", "Animal by Description: " + search);
        return "animal-list";
    }


    // New animal form
    @GetMapping("/createForm")
    public String showCreateForm(Model model) {
        Animal animal = new Animal();
        model.addAttribute("animal", animal);
        model.addAttribute("title", "Create New Animal");
        return "animal-create";
    }


    // Post new animal
//    @PostMapping("/new")
//    public Object addNewAnimal(@RequestBody Animal animal) {
//        service.addNewAnimal(animal);
//        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.CREATED);
//    }

    @PostMapping("/new")
    public Object addNewAnimal(Animal animal) {
        service.addNewAnimal(animal);
        return "redirect:/animals/all";
    }

    // Update form
    @GetMapping("/update/{animalID}")
    public String showUpdateForm(@PathVariable int animalID, Model model) {
        model.addAttribute("animal", service.getAnimalsByID(animalID));
        model.addAttribute("title", "Update Animal");
        return "animal-update";
    }

    // Update animal
//    @PutMapping("/update/{animalID}")
//    public Object updateAnimal(@PathVariable int animalID, @RequestBody Animal animal) {
//        service.updateAnimal(animalID, animal);
//        return new ResponseEntity<>(service.getAnimalsByID(animalID), HttpStatus.CREATED);
//    }

    @PostMapping("/update/{animalID}")
    public Object updateAnimal(@PathVariable int animalID, Animal animal) {
        service.updateAnimal(animalID, animal);
        return "redirect:/animals/" + animalID;
    }

    // Delete animal
//    @DeleteMapping("/delete/{animalID}")
//    public Object deleteAnimalById(@PathVariable int animalID) {
//        service.removeAnimal(animalID);
//        return new ResponseEntity<>(service.getAllAnimals(), HttpStatus.OK);
//    }

    @GetMapping("/delete/{animalID}")
    public Object deleteAnimalById(@PathVariable int animalID) {
        service.removeAnimal(animalID);
        return "redirect:/animals/all";
    }
}

