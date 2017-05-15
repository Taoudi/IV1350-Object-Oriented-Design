/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

import se.kth.iv1305.vehicleinspection.model.Printout;
import se.kth.iv1305.vehicleinspection.model.Receipt;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;

/**
 * This class represents a printer, but does onlt write out system.out
 */
public class Printer {

    /**
     * Prints the specified receipt. This dummy implementation prints to
     * <code>System.out</code> instead of a printer.
     *
     * @param receipt - Template for the receipt
     */
    public void printReceipt(Receipt receipt) {
        System.out.println("--------------------------");
        System.out.println("RECEIPT:");
        System.out.println(receipt.toString());
        System.out.println("--------------------------");

    }

    /**
     * prints printout as a system.out operation
     *
     * @param vehicle - the vehicle parts are need to print printout
     * @param printout - template for the printout
     */
    public void printPrintout(VehicleDTO vehicle, Printout printout) {
        System.out.println("--------------------------");
        System.out.println("PRINTOUT: ");
        System.out.println(printout.toString(vehicle));
        System.out.println("--------------------------");
    }
}
