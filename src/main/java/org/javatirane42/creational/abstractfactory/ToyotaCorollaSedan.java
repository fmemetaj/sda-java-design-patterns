package org.javatirane42.creational.abstractfactory;

public class ToyotaCorollaSedan extends ToyotaCorolla {

    @Override
    public Type getType() {
        return Type.SEDAN;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }
}
