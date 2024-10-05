package org.javatirane42.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class FlyweightMain {

    private static final int ITERATIONS = 1000;
    private static final int AVAILABLE_CAR_TYPES = 4;
    private static final List<String> VERSIONS = List.of("BASIC", "PREMIUM", "COMFORT");

    public static void main(String[] args) {
        final CarFactory carFactory = new CarFactory();

        final List<Car> producedCars = new ArrayList<>(ITERATIONS);

        for (int idx = 0; idx < ITERATIONS; idx++) {
            int carType = new Random().nextInt(AVAILABLE_CAR_TYPES);
            switch (carType) {
                case 0:
                    producedCars.add(carFactory.createSkodaCityGo(UUID.randomUUID().toString(), getVersion()));
                    break;
                case 1:
                    producedCars.add(carFactory.createVWGolf(UUID.randomUUID().toString(), getVersion()));
                    break;
                case 2:
                    producedCars.add(carFactory.createVWPolo(UUID.randomUUID().toString(), getVersion()));
                    break;
                case 3:
                    producedCars.add(carFactory.createVWPoloGTI(UUID.randomUUID().toString(), getVersion()));
                    break;
            }
        }

        System.out.println("I created " + producedCars.size() + " cars, but only " + Engine.instances + " references to Engine object");
    }

    private static String getVersion() {
        return VERSIONS.get(new Random().nextInt(VERSIONS.size()));
    }
}
