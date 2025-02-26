package org.javatirane42.creational.abstractfactory;

public class ToyotaCorollaCombi extends ToyotaCorolla{

    @Override
    public Type getType() {
        return Type.COMBI;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }
}
