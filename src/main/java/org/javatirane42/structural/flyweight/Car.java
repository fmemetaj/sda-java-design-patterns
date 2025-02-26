package org.javatirane42.structural.flyweight;

public class Car {

    private String producer;
    private String VIN;
    private String version;
    private String modelName;
    private Engine engine;

    public Car(String producer, String VIN, String version, String modelName, Engine engine) {
        this.producer = producer;
        this.VIN = VIN;
        this.version = version;
        this.modelName = modelName;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
