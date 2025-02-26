package org.javatirane42.behavioral.memento;

import java.util.ArrayList;

public class MementoMain {

    public static void main(String[] args) {
        GameState gameState = new GameState(100, 80, new ArrayList<>());

        GameStateManager gameStateManager = new GameStateManager();
        gameStateManager.saveGame(gameState);
        System.out.println(gameState);

        gameState.addItem("Basic Sword");
        gameState.takeDamage(10);
        System.out.println(gameState);

        gameStateManager.saveGame(gameState);

        gameState.takeDamage(50);
        gameState.addItem("Shield");
        System.out.println(gameState);

        gameStateManager.saveGame(gameState);

        gameStateManager.restorePreviousCheckpoint();
        GameStateSnapshot gameStateSnapshot = gameStateManager.restorePreviousCheckpoint();
        gameState.restoreFromSnapshot(gameStateSnapshot);
        System.out.println(gameState);
    }
}
