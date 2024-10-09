package co.simplon.safetynetcoppy.repositories;

import co.simplon.safetynetcoppy.entities.FirestationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirestationRepository
  extends JpaRepository<FirestationEntity, String> {}
