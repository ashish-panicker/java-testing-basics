package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PriceCalculator {

  private PriceCalculator() {
  }

  /**
   * Final price is calculated based on
   * 1. Travel Pass
   * 2. Travel Points 12 Points = 1 Rupee
   * 3. Age >= 60 -> 5% discount
   * 
   * @param passenger
   * @return
   */
  public static Passenger calculateFinalPrice(Passenger passenger) {

    float travelPassDiscount = passenger.getTravelPass().getDiscount();
    float travelPointDiscount = passenger.getTravelPoints() / 12;
    int ageDiscount = ChronoUnit.YEARS.between(LocalDate.now(), passenger.getDateOfBirth()) >= 60 ? 5 : 0;

    float initialPrice = passenger.getPrice();

    float finalPrice = initialPrice - (initialPrice * travelPassDiscount);
    finalPrice = finalPrice - (initialPrice * travelPointDiscount);
    finalPrice = finalPrice - (initialPrice * ageDiscount);

    passenger.setPrice(initialPrice);

    return passenger;
  }

}
