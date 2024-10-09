package co.simplon.safetynetcoppy.mapper;

import co.simplon.safetynetcoppy.domain.Person;
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
  Person toDomain(PersonEntity entity);
}
