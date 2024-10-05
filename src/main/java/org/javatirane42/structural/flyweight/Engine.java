package org.javatirane42.structural.flyweight;

public class Engine {

    public static int instances = 0;
    private String identifier;
    private Double volume;
    private EngineType engineType;

    public Engine(String identifier, Double volume, EngineType engineType) {
        instances++;
        this.identifier = identifier;
        this.volume = volume;
        this.engineType = engineType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
