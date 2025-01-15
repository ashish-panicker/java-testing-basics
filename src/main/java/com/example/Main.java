package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Passenger serviceMember, student, politician;

        serviceMember = new Passenger("John Doe",
                "john.doe",
                LocalDate.of(1980, 10, 20),
                Gender.MALE,
                4000,
                500,
                TravelPass.SERVICE_MEMBER);

        student = Passenger.builder()
                .fullName("Jane Doe").email("jane.doe")
                .dateOfBirth(LocalDate.of(2002, 2, 12))
                .gender(Gender.FEMALE).price(4500).travelPoints(0)
                .travelPass(TravelPass.STUDENT)
                .build();

        serviceMember = PriceCalculator.calculateFinalPrice(serviceMember);
        student = PriceCalculator.calculateFinalPrice(student);

    

    }
}