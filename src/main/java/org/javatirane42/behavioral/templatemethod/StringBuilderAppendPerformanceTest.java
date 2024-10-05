package org.javatirane42.behavioral.templatemethod;

import java.util.Random;

public class StringBuilderAppendPerformanceTest extends PerformanceTestTemplate {

    private static final int CHARS_NUM = 1000000;

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
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int idx = 0; idx < CHARS_NUM; idx++) {
            stringBuilder.append(Math.abs(random.nextInt() % 128));
        }
        System.out.println(stringBuilder);
    }
}
