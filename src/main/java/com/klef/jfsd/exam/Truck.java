package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "Truck")
public class Truck extends Vehicle {

    @Column(name = "load_capacity")
    private int loadCapacity;

    public Truck() {}

    public Truck(String name, String type, int maxSpeed, String color, int loadCapacity) {
        super(name, type, maxSpeed, color);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
