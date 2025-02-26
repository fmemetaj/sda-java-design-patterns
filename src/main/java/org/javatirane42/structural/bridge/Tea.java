package org.javatirane42.structural.bridge;

import static org.javatirane42.structural.bridge.Taste.SWEET;

public class Tea implements Drink {
    @Override
    public Taste getTaste() {
        return SWEET;
    }

    @Override
    public String getVolume() {
        return "200ml";
    }

    @Override
    public boolean isAddictive() {
        return false;
    }
}
