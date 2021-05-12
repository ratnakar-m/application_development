package com.bonhive.pmtool.services;

import com.bonhive.pmtool.domain.Person;
import com.bonhive.pmtool.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person savePerson(Person person){
        Person p = personRepository.save(person);
        return p;
    }
    public List<Person> findAll() {
        Iterable<Person> personsIterable =  personRepository.findAll();
        Iterator<Person> personsIterator = personsIterable.iterator();
        List<Person> personsList = new ArrayList<>();
        while(personsIterator.hasNext()){
            personsList.add(personsIterator.next());
        }

        return personsList;
    }
}
