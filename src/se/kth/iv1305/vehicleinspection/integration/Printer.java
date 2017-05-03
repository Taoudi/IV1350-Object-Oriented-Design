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
     * @param <code>receipt</code> - Template for the receipt
     */
    public  void printReceipt(Receipt receipt) { 
       System.out.println("----------------------");
       System.out.println("RECEIPT:");
       System.out.println(receipt.toString());
       System.out.println("----------------------");
    }
      /**
       * Prints the printout, however only as a system.out operation
       * @param <code>printout</code> - Template for the printout
       * @param <code>vehicle </code> - Is needed to get the vehicle part for each result
       */
    public void printPrintout(Printout printout, VehicleDTO vehicle){
            System.out.println("----------------------");
            System.out.println("PRINTOUT:");
         for(int i = 0;i<printout.getTextList().size();i++){
             System.out.println(vehicle.getListOfParts().get(i).toString() + ": " + printout.getTextList().get(i));
         }
         System.out.println("----------------------");
      }
}
