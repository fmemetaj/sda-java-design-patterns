package org.javatirane42.behavioral.state;

public class PaidState implements ParkingTicketVendingMachineState {

    private ParkingTicketVendingMachine machine;

    public PaidState(ParkingTicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void moveCreditCardToSensor() {
        machine.setMessage("Already paid. Please press button for printout");
    }

    @Override
    public void pressPrintingButton() {
        machine.printTicket();
        if (machine.getPrintingPaperPieces() == 0) {
            machine.setState(MoneyMachineState.NO_PAPER);
        } else {
            machine.setState(MoneyMachineState.NEED_PAYMENT);
        }
    }

    @Override
    public void openMachineAndAddPrintingPaperPieces() {
        machine.setMessage("Only authorized personel can add paper");
    }
}
