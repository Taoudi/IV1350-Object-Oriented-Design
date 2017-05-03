/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.view;

import java.util.*;
import se.kth.iv1305.vehicleinspection.controller.Controller;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;
import se.kth.iv1305.vehicleinspection.model.VehiclePart;
import se.kth.iv1305.vehicleinspection.model.CardDTO;
import se.kth.iv1305.vehicleinspection.integration.Result;
import se.kth.iv1305.vehicleinspection.model.Printout;

/**
 *
 * @author Youssef Taoudi
 */
/**
 * placeholder for the entire view
 */
public class View {

    private Controller contr;

    /**
     * creates new instance
     *
     * @param contr the controller that is used for all system operations.
     *
     */
    public View(Controller contr) {
        this.contr = contr;
    }

    /**
     * simulates user input that generates calls to all system operations
     */
    public void sampleExecution() {
        
        VehicleDTO vehicle = new VehicleDTO("LUL123");
        CardDTO creditCard = new CardDTO(1324,"12345678","hejsan",123,832);
        boolean [] resultList = {true,false,true,true};
        contr.nextCustomer();
        System.out.println("Door opens and number is dispalyed!");

        contr.closeDoor();
        System.out.println("Door is closed!");

        if (contr.checkRegNumber(vehicle) == true) {
            System.out.println("Number is valid!");
        } else {
            System.out.println("Invalid number!");
        }
        
        contr.calculateCost(vehicle).getAmountAsDouble();
        System.out.println("Cost is has been calculated!");
        
        
        if(contr.payWithCredit(creditCard,vehicle) == true){
            System.out.println("Payment went through");
        }
        
        //Hard code results for the inspections
        for (int i = 0; i<vehicle.getListOfParts().size();i++) {
            System.out.println("Result for " + contr.specifyPart(vehicle).toString() + " has been stored in catalog");
            contr.storeResult(resultList[i]);
        }
        contr.printResult(vehicle);
                   
    
    }
}
