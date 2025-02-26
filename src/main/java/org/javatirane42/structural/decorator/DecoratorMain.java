package org.javatirane42.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        FragStatistic statistic = new FirstPersonShooterStatistics();

        statistic.incrementDeathCount();

        FragStatistic decoratedStatistic =
                new DisplayCountInfoDecorator(new DeathCountInfoDecorator(statistic));

        decoratedStatistic.incrementDeathCount();
    }
}
