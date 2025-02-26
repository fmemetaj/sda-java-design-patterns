package org.javatirane42.behavioral.memento;

import java.util.List;

public class GameState {

    private Integer health;
    private Integer mana;
    private List<String> items;

    public GameState(Integer health, Integer mana, List<String> items) {
        this.health = health;
        this.mana = mana;
        this.items = items;
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

    public void heal() {
        health = 100;
    }

    public void takeDamage(final int damage) {
        health -= damage;
    }

    public void addItem(final String item) {
        items.add(item);
    }

    public void loseAllItems() {
        items.clear();
    }

    public void restoreFromSnapshot(GameStateSnapshot snapshot) {
        health = snapshot.getHealth();
        mana = snapshot.getMana();
        items = List.copyOf(snapshot.getItems());
    }

    @Override
    public String toString() {
        return "GameState{" +
                "health=" + health +
                ", mana=" + mana +
                ", items=" + items +
                '}';
    }
}
