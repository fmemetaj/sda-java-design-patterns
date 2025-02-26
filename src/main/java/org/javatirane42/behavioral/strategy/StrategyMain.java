package org.javatirane42.behavioral.strategy;

import java.util.Scanner;

public class StrategyMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StrategyType strategyType = StrategyType.valueOf(scanner.nextLine());
        String input = "hello from SDA knowledge base!";

        SpacesModificationStrategyProvider provider = new SpacesModificationStrategyProvider();

        SpacesModificationStrategy strategy = provider.get(strategyType);
        String output = strategy.modify(input);
        System.out.println("Result is " + output);
    }
}
