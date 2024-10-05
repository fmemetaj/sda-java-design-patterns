package org.javatirane42.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class PerformanceTestTemplate {

    protected abstract int getWarmUpIterationsNum();

    protected abstract int getIterationsNum();

    protected abstract void iteration();

    public void run() {
        for (int warmUpIterationIndex = 0; warmUpIterationIndex < getWarmUpIterationsNum(); warmUpIterationIndex++) {
            iteration();
        }

        List<Long> iterationsExecutionTimes = new ArrayList<>();

        for (int iterationIndex = 0; iterationIndex < getIterationsNum(); iterationIndex++) {
            long startTimestamp = System.currentTimeMillis();
            iteration();
            long endTimestamp = System.currentTimeMillis();
            iterationsExecutionTimes.add(endTimestamp - startTimestamp);
        }

        showStatistics(iterationsExecutionTimes);
    }

    private void showStatistics(List<Long> iterationsExecutionTimes) {
        System.out.println("Shortest iteration took " + calculateShortestIteration(iterationsExecutionTimes));
        System.out.println("Longest iteration took " + calculateLongestIteration(iterationsExecutionTimes));
        System.out.println("All iterations took " + calculateTotalExecutionTime(iterationsExecutionTimes));
    }

    private Long calculateShortestIteration(List<Long> iterationsDurations) {
        return iterationsDurations.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();
    }

    private Long calculateLongestIteration(List<Long> iterationsDurations) {
        return iterationsDurations.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();
    }

    private Long calculateTotalExecutionTime(List<Long> iterationsDurations) {
        return iterationsDurations.stream().mapToLong(x -> x).sum();
    }
}
