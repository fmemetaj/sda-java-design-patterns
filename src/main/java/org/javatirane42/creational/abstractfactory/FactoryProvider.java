package org.javatirane42.creational.abstractfactory;

public class FactoryProvider {
    public static CarFactory createCarFactory(CarType carType) {
        switch (carType) {
            case AUDI_A4:
                return new AudiA4Factory();
            case TOYOTA_COROLLA:
                return new ToyotaCorollaFactory();
        }
        throw new UnsupportedOperationException("Unknown car type: " + carType);
    }
}
