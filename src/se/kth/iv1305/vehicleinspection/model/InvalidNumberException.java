/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 * Thrown when vehicle does not have a valid register number
 */
public class InvalidNumberException extends Exception {

    private String invalidNumber;
   

    /**
     * Creates a new instance with a message telling user that the number is invalid
     * @param vehicleWithInvalidNumber Vehicle with invalid number
     */
    public InvalidNumberException (VehicleDTO vehicleWithInvalidNumber) {
        super("The register number: " + vehicleWithInvalidNumber.getRegNumber() + "is invalid");
        invalidNumber = vehicleWithInvalidNumber.getRegNumber();
    }
    
    /**
     * @return the car with invalid number
     */
    public String getInvalidNumber(){
        return invalidNumber;
    }
}
