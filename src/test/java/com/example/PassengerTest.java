package com.example;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PassengerTest {

    @Test
    @DisplayName("Test Passenger class")
    void testPassenger() {
        var passenger = new Passenger("John Doe",
                "john.doe",
                LocalDate.of(1980, 10, 20),
                Gender.MALE,
                4000,
                500,
                TravelPass.SERVICE_MEMBER);

        assertEquals("John Doe", passenger.getFullName());
        assertEquals("john.doe", passenger.getEmail());
        assertEquals(LocalDate.of(1980, 10, 20), passenger.getDateOfBirth());
        assertEquals(Gender.MALE, passenger.getGender());
        assertEquals(4000, passenger.getPrice());
        assertEquals(500, passenger.getTravelPoints());
        assertEquals(TravelPass.SERVICE_MEMBER, passenger.getTravelPass());

    }
}
