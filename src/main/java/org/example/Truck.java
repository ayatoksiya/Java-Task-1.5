package org.example;

public class Truck extends Vehicle {

    public Truck() {
        super();
    }

    @Override
    public void move() {
        System.out.println("I am truck my max speed is: " + getMaxSpeed());
    }
}
