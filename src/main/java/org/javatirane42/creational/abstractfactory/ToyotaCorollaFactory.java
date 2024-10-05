package org.javatirane42.creational.abstractfactory;

public class ToyotaCorollaFactory implements CarFactory {

    @Override
    public Car createSedan() {
        return new ToyotaCorollaSedan();
    }

    @Override
    public Car createCombi() {
        return new ToyotaCorollaCombi();
    }

    @Override
    public Car createHatchback() {
        return new ToyotaCorollaHatchback();
    }
}
