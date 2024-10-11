package co.simplon.safetynetcoppy.service;

import co.simplon.safetynetcoppy.domain.Person;
import co.simplon.safetynetcoppy.dtos.CreatePerson;
import java.util.List;

public interface PersonService {
  List<Person> findAll();

  Person save(CreatePerson person);
}
