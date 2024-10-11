package co.simplon.safetynetcoppy.dtos;

public record CreatePerson(
  Integer id,
  String firstName,
  String lastName,
  String address,
  String city,
  String zip,
  String phone,
  String email
) {}
