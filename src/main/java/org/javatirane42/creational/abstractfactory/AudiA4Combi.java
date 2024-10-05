package org.javatirane42.creational.abstractfactory;

public class AudiA4Combi extends AudiA4 {

    @Override
    public Type getType() {
        return Type.COMBI;
    }

    @Override
    public Integer getCylindersNum() {
        return 6;
    }
}
