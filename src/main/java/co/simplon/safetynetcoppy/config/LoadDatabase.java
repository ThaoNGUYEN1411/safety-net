package co.simplon.safetynetcoppy.config;

import co.simplon.safetynetcoppy.repositories.PersonRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@AllArgsConstructor
public class LoadDatabase {

  final DataWrapper dataWrapper;

  @Bean
  CommandLineRunner initDatabase(final PersonRepository personRepository) {
    return args -> {
      log.info("Démarrage et inscription en base de données");
      final var objectMapper = new ObjectMapper();
      final var entities = objectMapper.readValue(
        new File("src/main/resources/static/data.json"),
        Data.class
      );
      dataWrapper.addPersons(entities.getPersons());
      dataWrapper.addFirestations(entities.getFirestations());
      dataWrapper.addMedicalrecords(entities.getMedicalrecords());
    };
  }
}
