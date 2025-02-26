package org.javatirane42.behavioral.mediator;

public class MediatorMain {

    public static void main(String[] args) {
        ActionAppliedMessage actionAppliedMessage = new ActionAppliedMessage();
        SelectOptions selectOptions = new SelectOptions();
        WarningMessage warningMessage = new WarningMessage();

        Mediator mediator = new UserActionMediator(actionAppliedMessage, selectOptions, warningMessage);

        selectOptions.sendRequest("load");
        selectOptions.sendRequest("save");
        selectOptions.sendRequest("restart");
        warningMessage.sendRequest("hide");
    }
}
