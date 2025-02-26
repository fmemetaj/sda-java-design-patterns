package org.javatirane42.creational.factorymethod;

public class MonopolyGameFactory implements GameFactory{

    @Override
    public Game create() {
        return new BoardGame("Monopoly", "Family Game");
    }
}
