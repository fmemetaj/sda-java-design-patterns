package org.javatirane42.behavioral.memento;

import java.util.List;

public class GameStateSnapshot {

    private Integer health;
    private Integer mana;
    private List<String> items;

    public GameStateSnapshot(final GameState gameState) {
        this.health = gameState.getHealth();
        this.mana = gameState.getMana();
        this.items = List.copyOf(gameState.getItems()); // deep copy!
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
