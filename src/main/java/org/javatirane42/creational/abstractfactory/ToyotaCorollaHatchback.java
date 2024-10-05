package org.javatirane42.creational.abstractfactory;

public class ToyotaCorollaHatchback extends ToyotaCorolla {

    @Override
    public Type getType() {
        return Type.HATCHBACK;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }
}
