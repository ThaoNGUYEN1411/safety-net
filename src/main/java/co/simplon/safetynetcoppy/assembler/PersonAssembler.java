package co.simplon.safetynetcoppy.assembler;

import co.simplon.safetynetcoppy.domain.Person;
import co.simplon.safetynetcoppy.model.PersonModel;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonAssembler {

  public List<PersonModel> toModel(final List<Person> all) {
    return all.stream().map(this::toModel).toList();
  }

  public PersonModel toModel(final Person p) {
    return new PersonModel(
      p.id(),
      p.firstName(),
      p.lastName(),
      p.address(),
      p.phone(),
      p.email()
    );
  }
}
