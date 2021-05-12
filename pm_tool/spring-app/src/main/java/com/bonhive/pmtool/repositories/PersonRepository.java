package com.bonhive.pmtool.repositories;

import com.bonhive.pmtool.domain.Person;
import com.bonhive.pmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PersonRepository extends CrudRepository<Person, String> {
    @Override
    Iterable<Person> findAllById(Iterable<String> iterable);
}
