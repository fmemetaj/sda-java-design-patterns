package org.javatirane42.creational.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarType carType = CarType.valueOf(scanner.nextLine());
        System.out.println("User wants to produce a: " + carType);

        CarFactory factory = FactoryProvider.createCarFactory(carType);
        Car sedan = factory.createSedan();

        System.out.println("There is your sedan: " + sedan);
    }
}
