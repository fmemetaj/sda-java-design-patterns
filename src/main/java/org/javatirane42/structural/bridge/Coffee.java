package org.javatirane42.structural.bridge;

import static org.javatirane42.structural.bridge.Taste.BITTER;

public class Coffee implements Drink {

    @Override
    public Taste getTaste() {
        return BITTER;
    }

    @Override
    public String getVolume() {
        return "500ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }
}
