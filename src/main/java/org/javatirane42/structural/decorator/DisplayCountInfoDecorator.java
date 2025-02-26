package org.javatirane42.structural.decorator;

public class DisplayCountInfoDecorator implements FragStatistic {

    private FragStatistic fragStatistic;

    public DisplayCountInfoDecorator(FragStatistic fragStatistic) {
        this.fragStatistic = fragStatistic;
    }

    @Override
    public int incrementDeathCount() {
        int deathCount = fragStatistic.incrementDeathCount();
        System.out.println("Your death count is: " + deathCount);
        return deathCount;
    }

    @Override
    public void reset() {
        fragStatistic.reset();
        System.out.println("Status reset, death count 0");
    }
}
