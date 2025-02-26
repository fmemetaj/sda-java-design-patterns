package org.javatirane42.structural.proxy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SlackMessageSender implements MessageSender {

    private List<Message> messages = new ArrayList<>();

    @Override
    public void sendMessage(String channelName, String username, String messageText) {
        Message message = new Message(channelName, LocalDateTime.now(), username, messageText);
        System.out.println("Sent message: " + message);
        messages.add(message);
        System.out.println("Messages: " + messages);
    }
}
