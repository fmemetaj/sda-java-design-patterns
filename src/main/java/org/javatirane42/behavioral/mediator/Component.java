package org.javatirane42.behavioral.mediator;

public interface Component {
    void sendRequest();

    default void sendRequest(String context) {
        sendRequest();
    }
}
