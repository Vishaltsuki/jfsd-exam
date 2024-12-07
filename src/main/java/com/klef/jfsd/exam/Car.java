package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "Car")
public class Car extends Vehicle {

    @Column(name = "number_of_doors")
    private int numberOfDoors;

    public Car() {}

    public Car(String name, String type, int maxSpeed, String color, int numberOfDoors) {
        super(name, type, maxSpeed, color);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
