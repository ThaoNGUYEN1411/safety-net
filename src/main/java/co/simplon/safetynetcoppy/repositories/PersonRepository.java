package co.simplon.safetynetcoppy.repositories;

import co.simplon.safetynetcoppy.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository
  extends JpaRepository<PersonEntity, Integer> {}
