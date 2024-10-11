package co.simplon.safetynetcoppy.controller;

import co.simplon.safetynetcoppy.assembler.PersonAssembler;
import co.simplon.safetynetcoppy.dtos.CreatePerson;
import co.simplon.safetynetcoppy.model.PersonModel;
import co.simplon.safetynetcoppy.service.PersonService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/persons")
public class PersonController {

  private PersonService service;
  private PersonAssembler assembler;

  @GetMapping(value = { "", "/" })
  public ResponseEntity<List<PersonModel>> findAll() {
    return ResponseEntity
      .status(HttpStatus.OK)
      .body(assembler.toModel(service.findAll()));
  }

  @PostMapping
  public ResponseEntity<PersonModel> save(@RequestBody CreatePerson input) {
    return ResponseEntity
      .status(HttpStatus.CREATED)
      .body(assembler.toModel(service.save(input)));
  }
}
