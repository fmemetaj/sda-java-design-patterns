package org.javatirane42.structural.proxy;

import java.time.LocalDateTime;

public class Message {

    private String channelName;
    private LocalDateTime postDate;
    private String author;
    private String text;

    public Message(String channelName, LocalDateTime postDate, String author, String text) {
        this.channelName = channelName;
        this.postDate = postDate;
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "channelName='" + channelName + '\'' +
                ", postDate=" + postDate +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
