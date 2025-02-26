package org.javatirane42.behavioral.state;

public class NoPrintingPaperState implements ParkingTicketVendingMachineState{

    private ParkingTicketVendingMachine machine;

    public NoPrintingPaperState(ParkingTicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void moveCreditCardToSensor() {
        machine.setMessage("Cannot pay because there is no printing paper");
    }

    @Override
    public void pressPrintingButton() {
        machine.setMessage("Please call 728 123 1234 for additional printing paper");
    }

    @Override
    public void openMachineAndAddPrintingPaperPieces() {
        machine.addPrintingPaperPieces(100);
        machine.setState(MoneyMachineState.NEED_PAYMENT);
    }
}
