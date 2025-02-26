package org.javatirane42.structural.decorator;

public class FirstPersonShooterStatistics implements FragStatistic {

    private int deathCount = 0;

    @Override
    public int incrementDeathCount() {
        deathCount++;
        return deathCount;
    }

    @Override
    public void reset() {
        deathCount = 0;
    }
}
