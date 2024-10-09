package co.simplon.safetynetcoppy.config;

import co.simplon.safetynetcoppy.entities.FirestationEntity;
import co.simplon.safetynetcoppy.entities.MedicalrecordEntity;
import co.simplon.safetynetcoppy.entities.PersonEntity;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Data {

  private List<PersonEntity> persons;
  private List<MedicalrecordEntity> medicalrecords;
  private List<FirestationEntity> firestations;
}
