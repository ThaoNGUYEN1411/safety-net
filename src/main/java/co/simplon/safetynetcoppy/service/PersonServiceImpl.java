package co.simplon.safetynetcoppy.service;

import co.simplon.safetynetcoppy.domain.Person;
import co.simplon.safetynetcoppy.dtos.CreatePerson;
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

  @Override
  public List<Person> findAll() {
    return repository.findAll().stream().map(p -> mapper.toDomain(p)).toList();
  }

  @Override
  public Person save(CreatePerson input) {
    //    final var entity = new PersonEntity();
    /* todo Thao: how to use mapper here */
    //    entity.setFirstName(input.firstName());
    //    entity.setLastName(input.lastName());
    //    entity.setAddress(input.address());
    //    entity.setZip(input.zip());
    //    entity.setCity(input.city());
    //    entity.setPhone(input.phone());
    //    entity.setEmail(input.email());

    return mapper.toDomain(repository.save(mapper.toEntity(input)));
  }
}
