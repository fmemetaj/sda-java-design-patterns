package org.javatirane42.behavioral.mediator;

public class ActionAppliedMessage implements Component{

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void displayInfo() {
        System.out.println("Action was applied successfully");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "ActionAppliedMessage");
    }
}
