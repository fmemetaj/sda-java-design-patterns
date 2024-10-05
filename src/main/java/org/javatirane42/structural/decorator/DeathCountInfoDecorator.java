package org.javatirane42.structural.decorator;

public class DeathCountInfoDecorator implements FragStatistic {

    private FragStatistic fragStatistic;

    public DeathCountInfoDecorator(FragStatistic fragStatistic) {
        this.fragStatistic = fragStatistic;
    }

    @Override
    public int incrementDeathCount() {
        return fragStatistic.incrementDeathCount();
    }

    @Override
    public void reset() {
        fragStatistic.reset();
    }
}
