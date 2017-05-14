/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.view;

import java.io.IOException;
import java.util.*;
import se.kth.iv1305.vehicleinspection.controller.Controller;
import se.kth.iv1305.vehicleinspection.controller.OperationFailedException;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;
import se.kth.iv1305.vehicleinspection.model.VehiclePart;
import se.kth.iv1305.vehicleinspection.model.CardDTO;
import se.kth.iv1305.vehicleinspection.integration.Result;
import se.kth.iv1305.vehicleinspection.model.InvalidNumberException;
import se.kth.iv1305.vehicleinspection.model.Printout;
import se.kth.iv1305.vehicleinspection.util.LogHandler;
/**
 *
 * @author Youssef Taoudi
 */
/**
 * placeholder for the entire view
 */
public class View {

    private Controller contr;
    private ErrorMessageHandler errorMessageHandler = new ErrorMessageHandler();
    private LogHandler log;
    /**
     * creates new instance
     *
     * @param contr the controller that is used for all system operations.
     *
     */
    public View(Controller contr) throws IOException{
        this.contr = contr;
        this.log = new LogHandler();
    }

    /**
     * simulates user input that generates calls to all system operations
     */
    public void sampleExecution() throws InvalidNumberException, OperationFailedException {

        VehicleDTO vehicle = new VehicleDTO("LUX123");
        CardDTO creditCard = new CardDTO(1324, "12345678", "hejsan", 123, 832);
        boolean[] resultList = {true, false, true, true};
        contr.nextCustomer();
        System.out.println("Door opens and number is dispalyed!");

        contr.closeDoor();
        System.out.println("Door is closed!");

        /**
         * if (contr.checkRegNumber(vehicle) == true) {
         * System.out.println("Number is valid!"); } else {
         * System.out.println("Invalid number!"); } *
         */
        try {
            System.out.println("Checking register number.");
            if (contr.checkRegNumber(vehicle) == true) {
                System.out.println("Number is valid!");
            }
        }
            catch(OperationFailedException exc){
                handleException("Wrong exception type.", exc);
            }
            catch(InvalidNumberException exc){
            handleException("INVALID NUMBER", exc);
        }
        
        contr.calculateCost(vehicle).getAmountAsDouble();
        System.out.println("Cost is has been calculated!");

        if (contr.payWithCredit(creditCard, vehicle) == true) {
            System.out.println("Payment went through");
        }

        //Hard code results for the inspections
        for (int i = 0; i < vehicle.getListOfParts().size(); i++) {
            System.out.println("Result for " + contr.specifyPart(vehicle).toString() + " has been stored in catalog");
            contr.storeResult(resultList[i]);
        }
        contr.printResult(vehicle);

    }

    private void handleException(String uiMsg, Exception exc) {
        errorMessageHandler.showErrorMessage(uiMsg);
        log.logException(exc);
    }
}
