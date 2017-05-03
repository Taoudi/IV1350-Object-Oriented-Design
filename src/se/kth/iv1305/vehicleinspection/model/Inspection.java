/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

import se.kth.iv1305.vehicleinspection.integration.Printer;

/**
 *
 * Holds information of the inspection
 */
public class Inspection {

    Payment payment;
    Printer printer;
    
    /**
     * 
     * @param payment holds information of the payment
     * @param printer represents the printer
     */
    public Inspection(Payment payment, Printer printer) {
        this.payment = payment;
        this.printer = printer;
    }
    /**
     * This method creates a receipt with a string that is printed out as a System printout.
     */
    public  void printReceipt() {
        Receipt receipt = new Receipt(Double.toString(payment.amountCost.getAmountAsDouble()) + " was payed for the Inspection");
        printer.printReceipt(receipt);
    }

}
