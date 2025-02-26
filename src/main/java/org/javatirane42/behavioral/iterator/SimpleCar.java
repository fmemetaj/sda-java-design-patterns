package org.javatirane42.behavioral.iterator;

public class SimpleCar implements Car {

    private static int index = 0;
    private final String info;

    public SimpleCar() {
        info = "Mazda 6 with id " + ++index;
    }

    @Override
    public String getVehicleInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "SimpleCar{" +
                "info='" + info + '\'' +
                '}';
    }
}
