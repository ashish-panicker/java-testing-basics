package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Passenger {

  private String fullName;
  private String email;
  private LocalDate dateOfBirth;
  private Gender gender;
  private float price;
  private int travelPoints;
  private TravelPass travelPass;

}
