/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection;

import java.io.IOException;
import se.kth.iv1305.vehicleinspection.view.View;
import se.kth.iv1305.vehicleinspection.controller.Controller;
import se.kth.iv1305.vehicleinspection.integration.RegistryCreator;
import se.kth.iv1305.vehicleinspection.integration.Printer;
import se.kth.iv1305.vehicleinspection.model.InvalidNumberException;
import se.kth.iv1305.vehicleinspection.model.garage.Garage;
/**
 * Performs all startup of program
 */
class Main {

    /**
     * Starts the application.
     *
     * @param args The application does not take any command line parameters.
     * @throws InvalidNumberException if reg number is invalid
     */
    public static void main(String[] args) throws InvalidNumberException {
        try {
            Printer printer = new Printer();
            Garage garage = new Garage();
            RegistryCreator creator = new RegistryCreator();
            Controller contr = new Controller(creator, garage, printer);
            new View(contr).sampleExecution();
            
        } catch (IOException ex) {
            System.out.println("Unable to start program");
            ex.printStackTrace();
        }

    }
}
