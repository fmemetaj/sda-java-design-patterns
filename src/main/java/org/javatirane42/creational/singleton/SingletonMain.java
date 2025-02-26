package org.javatirane42.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonLazyExample firstLazyInstance = SingletonLazyExample.getInstance();

        SingletonLazyExample secondLazyInstance = SingletonLazyExample.getInstance();
    }
}
