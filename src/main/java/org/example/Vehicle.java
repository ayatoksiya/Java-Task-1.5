package org.example;

public abstract class Vehicle implements Mobile {
    private int maxSpeed = 300;

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public Vehicle() {
    }

    @Override
    public void move() {
        System.out.println("My max speed is: " + getMaxSpeed());
    }
}
