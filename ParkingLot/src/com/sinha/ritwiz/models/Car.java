package com.sinha.ritwiz.models;

public class Car {
    private final String registrationNumber;
    private final String color;
    public Car(String registrationNumber, String color) {
        this.color = color;
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return this.color;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
}
