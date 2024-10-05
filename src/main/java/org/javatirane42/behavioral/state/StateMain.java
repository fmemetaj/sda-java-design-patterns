package org.javatirane42.behavioral.state;

public class StateMain {

    public static void main(String[] args) {
        ParkingTicketVendingMachine machine = new ParkingTicketVendingMachine();
        ParkingTicketVendingMachineState state = new StillNeedToPayState(machine);
        state.openMachineAndAddPrintingPaperPieces();
        state.pressPrintingButton();
        state.moveCreditCardToSensor();

        state = new PaidState(machine);
        state.moveCreditCardToSensor();
        state.openMachineAndAddPrintingPaperPieces();
        state.pressPrintingButton();
    }
}
