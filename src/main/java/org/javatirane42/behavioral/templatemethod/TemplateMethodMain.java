package org.javatirane42.behavioral.templatemethod;

public class TemplateMethodMain {

    public static void main(String[] args) {
        PerformanceTestTemplate testTemplate = new RandomListSortingPerformanceTest();
        testTemplate.run();

        testTemplate = new StringBuilderAppendPerformanceTest();
        testTemplate.run();
    }
}
