package org.javatirane42.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomListSortingPerformanceTest extends PerformanceTestTemplate {

    private static final int NUMBERS_NUM = 100000;

    @Override
    protected int getWarmUpIterationsNum() {
        return 2;
    }

    @Override
    protected int getIterationsNum() {
        return 100;
    }

    @Override
    protected void iteration() {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int idx = 0; idx < NUMBERS_NUM; idx++) {
            integers.add(random.nextInt());
        }

        Collections.sort(integers);
    }
}
