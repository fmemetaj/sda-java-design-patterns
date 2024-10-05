package org.javatirane42.behavioral.observer;

public abstract class BaseObserver {

    protected ChatChannel chatChannel;

    public BaseObserver(ChatChannel chatChannel) {
        this.chatChannel = chatChannel;
        chatChannel.subscribe(this);
    }

    public abstract void handleMessage(String message, String userType);

    public abstract String getObserverType();

    public void sendMessage(String message) {
        chatChannel.sendMessage(message, getObserverType());
    }
}
