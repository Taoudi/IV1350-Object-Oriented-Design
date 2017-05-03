/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection;
import se.kth.iv1305.vehicleinspection.view.View;
import se.kth.iv1305.vehicleinspection.controller.Controller;
import se.kth.iv1305.vehicleinspection.integration.RegistryCreator;
import se.kth.iv1305.vehicleinspection.integration.Printer;
import se.kth.iv1305.vehicleinspection.model.garage.Garage;
/**
 *
 * @author taoudi
 */
class Main {

   
    public static void main(String[] args) {
        Printer printer = new Printer();
        Garage garage = new Garage();
        RegistryCreator creator = new RegistryCreator();
        Controller contr = new Controller(creator, garage,printer);
        new View(contr).sampleExecution();
    }
    
}
