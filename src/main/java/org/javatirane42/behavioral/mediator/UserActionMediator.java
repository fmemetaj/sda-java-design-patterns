package org.javatirane42.behavioral.mediator;

public class UserActionMediator implements Mediator {

    private ActionAppliedMessage actionAppliedMessage;
    private SelectOptions selectOptions;
    private WarningMessage warningMessage;

    public UserActionMediator(ActionAppliedMessage actionAppliedMessage, SelectOptions selectOptions, WarningMessage warningMessage) {
        this.actionAppliedMessage = actionAppliedMessage;
        this.selectOptions = selectOptions;
        this.warningMessage = warningMessage;
        actionAppliedMessage.setMediator(this);
        selectOptions.setMediator(this);
        warningMessage.setMediator(this);
    }

    @Override
    public void sendInfo(Object requester, String context) {
        if (requester == actionAppliedMessage) {
            actionAppliedMessage.displayInfo();
            warningMessage.hideWarning();
            selectOptions.hideOptions();
        } else if (requester == selectOptions) {
            switch (context) {
                case "load":
                    selectOptions.chooseLoad();
                    actionAppliedMessage.displayInfo();
                    break;
                case "restart":
                    selectOptions.chooseRestart();
                    warningMessage.showWarningMessage();
                    break;
                case "save":
                    selectOptions.chooseSave();
                    actionAppliedMessage.displayInfo();
                    break;
            }
        } else if (requester == warningMessage) {
            if (context.equals("hide")) {
                warningMessage.hideWarning();
            } else {
                warningMessage.showWarningMessage();
            }
        }
    }
}
