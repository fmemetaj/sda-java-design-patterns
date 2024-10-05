package org.javatirane42.structural.flyweight;

import java.util.List;

public class CarFactory {

    private static final List<Engine> engines = List.of(
            new Engine("polo", 1.6D, EngineType.DIESEL),
            new Engine("poloGTI", 2.0D, EngineType.GASOLINE),
            new Engine("golf", 1.5, EngineType.GASOLINE),
            new Engine("e", 0D, EngineType.ELECTRIC)
    );

    private static Engine findEngineByKey(String key) {
        return engines.stream()
                .filter(engine -> engine.getIdentifier().equals(key))
                .findFirst()
                .orElseThrow();
    }

    public Car createVWPolo(String vin, String version) {
        return new Car("VW", vin, version, "Polo", findEngineByKey("polo"));
    }

    public Car createVWPoloGTI(String vin, String version) {
        return new Car("VW", vin, version, "poloGTI", findEngineByKey("poloGTI"));
    }

    public Car createVWGolf(String vin, String version) {
        return new Car("VW", vin, version, "Golf", findEngineByKey("golf"));
    }

    public Car createSkodaCityGo(String vin, String version) {
        return new Car("Skoda", vin, version, "CityGO", findEngineByKey("e"));
    }
}
