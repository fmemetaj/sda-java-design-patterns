package org.javatirane42.creational.abstractfactory;

public class AudiA4Sedan extends AudiA4 {

    @Override
    public Type getType() {
        return Type.SEDAN;
    }

    @Override
    public Integer getCylindersNum() {
        return 6;
    }
}
