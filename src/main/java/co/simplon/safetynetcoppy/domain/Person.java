package co.simplon.safetynetcoppy.domain;

public record Person(
  Integer id,
  String firstName,
  String lastName,
  String address,
  String city,
  String zip,
  String phone,
  String email
) {}
