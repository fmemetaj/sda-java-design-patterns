package org.javatirane42.creational.abstractfactory;

public class AudiA4Hatchback extends AudiA4 {

    @Override
    public Type getType() {
        return Type.HATCHBACK;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }
}
