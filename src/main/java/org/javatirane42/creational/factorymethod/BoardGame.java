package org.javatirane42.creational.factorymethod;

public class BoardGame implements Game {
    private String name;
    private String type;

    public BoardGame(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
