package co.simplon.safetynetcoppy.repositories;

import co.simplon.safetynetcoppy.entities.MedicalrecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalrecordRepository
  extends JpaRepository<MedicalrecordEntity, Integer> {}
