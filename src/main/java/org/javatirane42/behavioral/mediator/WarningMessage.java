package org.javatirane42.behavioral.mediator;

public class WarningMessage implements Component {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void showWarningMessage() {
        System.out.println("Are you sure?");
    }

    public void hideWarning() {
        System.out.println("");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "WarningMessage");
    }
}
