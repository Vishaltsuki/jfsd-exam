package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "Vehicle")
@Inheritance(strategy = InheritanceType.JOINED) // Use the table-per-concrete class inheritance with JOIN
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "max_speed")
    private int maxSpeed;

    @Column(name = "color")
    private String color;

    public Vehicle() {}

    public Vehicle(String name, String type, int maxSpeed, String color) {
        this.name = name;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
}