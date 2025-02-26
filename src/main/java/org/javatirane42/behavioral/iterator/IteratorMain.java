package org.javatirane42.behavioral.iterator;

import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        for (int idx = 0; idx < 12; idx++) {
            parkingLot.add(new SimpleCar());
        }

        Iterator<Car> iterator = parkingLot.iterator();
        while (iterator.hasNext()) {
            final Car car = iterator.next();
            System.out.println(car);
        }
    }
}
