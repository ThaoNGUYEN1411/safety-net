package co.simplon.safetynetcoppy.mapper;

import co.simplon.safetynetcoppy.domain.Person;
import co.simplon.safetynetcoppy.dtos.CreatePerson;
import co.simplon.safetynetcoppy.entities.PersonEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
  componentModel = "spring",
  unmappedSourcePolicy = ReportingPolicy.IGNORE,
  injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface PersonMapper {
  //Todo Thao: mapper Dto with entity is correct?
  Person toDomain(PersonEntity entity);
  Person toDomain(CreatePerson person);
  PersonEntity toEntity(Person person);
  PersonEntity toEntity(CreatePerson person);
}
