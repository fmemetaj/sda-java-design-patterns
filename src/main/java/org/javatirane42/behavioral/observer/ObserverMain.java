package org.javatirane42.behavioral.observer;

public class ObserverMain {

    public static void main(String[] args) {
        ChatChannel chatChannel = new ChatChannel("design-patterns");

        BaseObserver userA = new UserObserver(chatChannel, "andrew");
        BaseObserver userB = new UserObserver(chatChannel, "ala");
        BaseObserver adminA = new AdminObserver(chatChannel, "john");
        BaseObserver adminB = new AdminObserver(chatChannel, "ann");

        userA.sendMessage("Hello all");
        userB.sendMessage("Hi Andrew");
        adminA.sendMessage("ann they can't see what we write");
        adminB.sendMessage("Yes I know");
    }
}
