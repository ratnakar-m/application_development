package com.bonhive.pmtool.web;

import com.bonhive.pmtool.domain.Person;
import com.bonhive.pmtool.domain.Project;
import com.bonhive.pmtool.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("")
    public ResponseEntity<Person> createNewProject(@RequestBody Person person){
        personService.savePerson(person);
        return new ResponseEntity<Person>(person, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllProjects(){
        List<Person> persons = personService.findAll();
        ResponseEntity<List<Person>> personsResponse = new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
        return personsResponse;
    }
}
