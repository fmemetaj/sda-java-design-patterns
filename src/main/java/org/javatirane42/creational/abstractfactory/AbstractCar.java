package org.javatirane42.creational.abstractfactory;

public abstract class AbstractCar implements Car {

    @Override
    public String toString() {
        return "Car: " + getModelName() + " " + getType() + " has " + getCylindersNum() + " cylinders";
    }
}
