package org.javatirane42.creational.factorymethod;

import java.util.Scanner;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        GameFactory gameFactory = null;

        switch (type) {
            case "monopoly":
                gameFactory = new MonopolyGameFactory();
                break;
            default:
                System.out.println("No game found with this type");
                break;
        }

        Game createGame = gameFactory.create();
        System.out.println("Created game" + createGame);
    }
}
