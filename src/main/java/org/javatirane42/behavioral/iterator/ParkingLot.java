package org.javatirane42.behavioral.iterator;

import java.util.Iterator;

public class ParkingLot implements Iterable<Car> {

    private static int INITIAL_CAPACITY = 5;
    private int indexToAdd = 0;

    private Car[] cars = new Car[INITIAL_CAPACITY];

    public void add(final Car car) {
        if (indexToAdd == cars.length) {
            Car[] biggerCars = new Car[2 * cars.length];
            System.arraycopy(cars, 0, biggerCars, 0, cars.length);
            cars = biggerCars;
        } else {
            cars[indexToAdd++] = car;
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    public class CarIterator implements Iterator<Car> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < cars.length && cars[index] != null;
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }
}
