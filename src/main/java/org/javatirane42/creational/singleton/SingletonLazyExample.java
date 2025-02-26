package org.javatirane42.creational.singleton;

public class SingletonLazyExample {
    private static SingletonLazyExample instance;

    public static SingletonLazyExample getInstance() {
        if (instance == null) {
            System.out.println("Creating new instance for SingletonLazyExample");
            instance = new SingletonLazyExample();
        }

        return instance;
    }
}
