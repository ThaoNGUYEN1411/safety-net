package co.simplon.safetynetcoppy.model;

public record PersonModel(
  Integer id,
  String firstName,
  String lastName,
  String address,
  String phone,
  String email
) {}
