/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.controller;

import java.util.ArrayList;
import java.util.List;
import se.kth.iv1305.vehicleinspection.integration.InspectionCatalog;
import se.kth.iv1305.vehicleinspection.model.garage.Garage;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;
import se.kth.iv1305.vehicleinspection.integration.RegNumberRegistry;
import se.kth.iv1305.vehicleinspection.integration.RegistryCreator;
import se.kth.iv1305.vehicleinspection.model.Payment;
import se.kth.iv1305.vehicleinspection.model.Amount;
import se.kth.iv1305.vehicleinspection.model.CardDTO;
import se.kth.iv1305.vehicleinspection.integration.PaymentAuthorizationSystem;
import se.kth.iv1305.vehicleinspection.integration.Printer;
import se.kth.iv1305.vehicleinspection.integration.Result;
import se.kth.iv1305.vehicleinspection.integration.ResultObserver;
import se.kth.iv1305.vehicleinspection.model.Inspection;
import se.kth.iv1305.vehicleinspection.model.Printout;
import se.kth.iv1305.vehicleinspection.model.VehiclePart;
import se.kth.iv1305.vehicleinspection.model.InvalidNumberException;

/**
 *
 * Controller handles the system operation and calls methods when necessary
 */
public class Controller {

    private List<ResultObserver> resultObservers = new ArrayList<>();
    private PaymentAuthorizationSystem paySystem;
    private Garage garage;
    private RegNumberRegistry numberList;
    private Printer printer;
    private InspectionCatalog inspectionCatalog;
    
    /**
     * 
     * @param regCreator creates all of the registers
     * @param garage    instance of the garage
     * @param printer   prints receipt/printout
     * @param paySystem  authorizes payment
     */
    public Controller(RegistryCreator regCreator, Garage garage, Printer printer, PaymentAuthorizationSystem paySystem) {
        this.numberList = regCreator.getNumberRegistry();
        this.garage = garage;
        this.printer = printer;
        this.inspectionCatalog = regCreator.getInspectionCatalog();
        this.paySystem = paySystem;
    }

    /**
     * This system operation opens the garage door and displays a number
     */
    public void nextCustomer() {
        garage.nextCustomer();
        inspectionCatalog.addResultObservers(resultObservers);
    }

    /**
    * 
    * @param obs - reference to the ResultObserver class
    */
    public void addResultObserver(ResultObserver obs) {
        resultObservers.add(obs);
    }

    /**
     * this system operation closes the garage door
     */
    public void closeDoor() {
        garage.closeDoor();
    }

    /**
     *
     * @param vehicle the vehicle that is to be inspected
     * @return true means the regnumber is valid, false means its not
     * @throws InvalidNumberException if number is invalid
     */
    public boolean checkRegNumber(VehicleDTO vehicle) throws InvalidNumberException {
        return numberList.checkIfValid(vehicle);

    }

    /**
     *
     * @param vehicle the vehicle that is to be inspected
     * @return An instance of <code>Amount</code> which holds information of the
     * cost
     */
    public Amount calculateCost(VehicleDTO vehicle) {
        Payment payment = new Payment(vehicle);
        return payment.getCost();
    }

    /**
     *
     * @param creditCard - Is needed to sen a payment request
     * @param vehicle - is needed to create a new payment
     * @return true if payment was authorized, in this case it is always true
     */
    public boolean payWithCredit(CardDTO creditCard, VehicleDTO vehicle) {
        Payment payment = new Payment(vehicle);
        Inspection inspection = new Inspection(payment, printer);
        inspection.printReceipt();
        return paySystem.authorizePayment(creditCard, payment.getCost());
    }

    /**
     *
     * @param vehicle - Is needed to access the list of vehicle parts
     * @return VehiclePart - Return the specified part
     */
    public VehiclePart specifyPart(VehicleDTO vehicle) {
        return vehicle.findPart();
    }

    /**
     * this method stores the results in a catalog
     *
     * @param inspectionPassed, true if passed, false if failed
     */
    public void storeResult(boolean inspectionPassed) {
        inspectionCatalog.storeResult(inspectionPassed);
    }
    
    /**
     * Prints the result as a system.out operation
     * @param vehicle - The vehicle that was expected
     */
    public void printResult(VehicleDTO vehicle) {
        Printout printout = new Printout(inspectionCatalog);
        printer.printPrintout(printout, vehicle);
    }

}
