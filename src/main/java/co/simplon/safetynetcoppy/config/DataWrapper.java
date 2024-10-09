package co.simplon.safetynetcoppy.config;

import co.simplon.safetynetcoppy.entities.FirestationEntity;
import co.simplon.safetynetcoppy.entities.MedicalrecordEntity;
import co.simplon.safetynetcoppy.entities.PersonEntity;
import co.simplon.safetynetcoppy.repositories.FirestationRepository;
import co.simplon.safetynetcoppy.repositories.MedicalrecordRepository;
import co.simplon.safetynetcoppy.repositories.PersonRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataWrapper {

  private final PersonRepository personRepository;
  private final MedicalrecordRepository medicalrecordRepository;
  private final FirestationRepository firestationRepository;

  public void addPersons(final List<PersonEntity> persons) {
    for (final PersonEntity person : persons) {
      personRepository.save(person);
    }
  }

  public void addMedicalrecords(
    final List<MedicalrecordEntity> medicalrecords
  ) {
    for (final MedicalrecordEntity medicalrecord : medicalrecords) {
      medicalrecordRepository.save(medicalrecord);
    }
  }

  public void addFirestations(final List<FirestationEntity> firestations) {
    for (final FirestationEntity firestation : firestations) {
      firestationRepository.save(firestation);
    }
  }
}
