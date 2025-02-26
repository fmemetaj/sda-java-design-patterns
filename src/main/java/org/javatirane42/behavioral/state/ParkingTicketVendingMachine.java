package org.javatirane42.behavioral.state;

import java.time.LocalDateTime;

public class ParkingTicketVendingMachine {

    private MoneyMachineState state = MoneyMachineState.NEED_PAYMENT;
    private int printingPaperPieces = 100;
    private String message;

    public MoneyMachineState getState() {
        return state;
    }

    public int getPrintingPaperPieces() {
        return printingPaperPieces;
    }

    public void setPrintingPaperPieces(int printingPaperPieces) {
        this.printingPaperPieces = printingPaperPieces;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setState(MoneyMachineState state) {
        this.state = state;
    }

    public void addPrintingPaperPieces(int pieces) {
        if (pieces <= 0) {
            throw new UnsupportedOperationException("Cannot add non positive number of pieces");
        }
        printingPaperPieces += pieces;

        if (state == MoneyMachineState.NO_PAPER) {
            state = MoneyMachineState.NEED_PAYMENT;
        }
        message = "Please pay for the parking";
    }

    public void payForOneHourWithCreditCard() {
        if (state == MoneyMachineState.NEED_PAYMENT) {
            System.out.println("Paying for parking 5$");
            state = MoneyMachineState.PAID_READY_TO_PRINT;
        }
        message = "Please click the button to print the ticket";
    }

    public void printTicket() {
        if (state == MoneyMachineState.PAID_READY_TO_PRINT) {
            printingPaperPieces -= 1;
            System.out.println("Ticket valid thru " + LocalDateTime.now().plusHours(1));

            if (printingPaperPieces == 0) {
                state = MoneyMachineState.NO_PAPER;
            } else {
                state = MoneyMachineState.NEED_PAYMENT;
            }
        }

        message = "Ticket printed. Please collect it";
    }

    public void goDown() {
        if (state == MoneyMachineState.PAID_READY_TO_PRINT) {
            System.out.println("Trying to revert last transaction");
        }
        state = MoneyMachineState.UNAVAILABLE;
        message = "Vending machine is unavailable. Try another one";
    }
}
