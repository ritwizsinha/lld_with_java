package com.sinha.ritwiz.models;

public class Slot {
    private int id;
    private Car car;
    public Slot(int id) {
        this.id = id;
        this.car = null;
    }

    public void parkCar(Car car) {
        this.car = car;
    }

    public void unparkCar() {
        this.car = null;
    }

    public int getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public boolean isOccupied() {
        return car != null;
    }
}
