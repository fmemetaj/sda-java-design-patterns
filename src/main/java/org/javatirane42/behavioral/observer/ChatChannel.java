package org.javatirane42.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ChatChannel {

    private String name;
    private List<BaseObserver> observers = new ArrayList<>();
    private List<String> messages = new ArrayList<>();

    public ChatChannel(String name) {
        this.name = name;
    }

    public void subscribe(BaseObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void sendMessage(String message, String observerType) {
        messages.add(message);
        notifyAboutChange(message, observerType);
    }

    private void notifyAboutChange(String message, String observerType) {
        for (final var observer : observers) {
            observer.handleMessage(message, observerType);
        }
    }

    public String getName() {
        return name;
    }
}
