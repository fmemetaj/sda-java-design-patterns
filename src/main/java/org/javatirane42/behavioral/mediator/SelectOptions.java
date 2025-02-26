package org.javatirane42.behavioral.mediator;

public class SelectOptions implements Component {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void displayOptions() {
        System.out.println("Options are: Save, Load, Restart");
    }

    public void chooseSave() {
        System.out.println("Status was saved");
    }

    public void chooseLoad() {
        System.out.println("Loading previous data");
    }

    public void chooseRestart() {
        System.out.println("Status is restarting");
    }

    public void hideOptions() {
        System.out.println("Hiding options");
    }

    @Override
    public void sendRequest() {
        mediator.sendInfo(this, "displayOptions");
    }

    @Override
    public void sendRequest(String context) {
        mediator.sendInfo(this, context);
    }
}
