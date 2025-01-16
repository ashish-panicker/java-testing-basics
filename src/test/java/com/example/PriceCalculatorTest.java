package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

class PriceCalculatorTest {

    Passenger  passenger;

    @BeforeEach
    public void setUp() {
        passenger = Passenger.builder()
                .fullName("Jane Doe").email("jane.doe")
                .dateOfBirth(LocalDate.of(2002, 2, 12))
                .gender(Gender.FEMALE).price(4500).travelPoints(0)
                .travelPass(TravelPass.STUDENT).build();
    }

    @AfterEach
    public void tearDown() {
        passenger = null;
    }

    @Test
    @DisplayName("Test final discount when the passenger is a student")
    void giveStudent_whenPriceCalculated_thenReturnDiscount() {
        float initPrice = passenger.getPrice();
        float expectedPrice = initPrice - (initPrice * 0.05f);
        var discounterPassenger = PriceCalculator
                    .calculateFinalPrice(passenger);
        String message = String.format("%s is the actual price", passenger.getPrice());
        assertEquals(0, passenger.getTravelPoints());
        assertEquals(5.0f, passenger.getTravelPass().getDiscount());
        assertEquals(expectedPrice, discounterPassenger.getPrice(), message);

    }

}