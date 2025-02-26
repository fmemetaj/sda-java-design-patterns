package org.javatirane42.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameStateManager {

    private Deque<GameStateSnapshot> snapshots = new ArrayDeque<>();

    public void saveGame(GameState gameState) {
        snapshots.push(new GameStateSnapshot(gameState));
    }

    public GameStateSnapshot restorePreviousCheckpoint() {
        return snapshots.pop();
    }
}
