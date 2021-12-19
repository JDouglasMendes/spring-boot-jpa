package douglasmendes.controller;

import douglasmendes.controller.dtos.PersonDTO;
import douglasmendes.domain.Person;
import douglasmendes.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository repository;

    @PostMapping("/person")
    public @ResponseBody ResponseEntity<Person> addPerson(@Valid @RequestBody PersonDTO person) {
        return new ResponseEntity(repository.save(person.ToPerson()), HttpStatus.CREATED);
    }
    @GetMapping("/person")
    public Iterable<Person> GetAllPerson(){
        return  repository.findAll();
    }
}
