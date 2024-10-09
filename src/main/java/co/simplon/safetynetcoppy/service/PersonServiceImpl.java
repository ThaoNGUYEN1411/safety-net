package co.simplon.safetynetcoppy.service;

import co.simplon.safetynetcoppy.domain.Person;
import co.simplon.safetynetcoppy.mapper.PersonMapper;
import co.simplon.safetynetcoppy.repositories.PersonRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

  private PersonRepository repository;
  private PersonMapper mapper;

  public List<Person> findAll() {
    return repository.findAll().stream().map(p -> mapper.toDomain(p)).toList();
  }
}
