/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

import se.kth.iv1305.vehicleinspection.model.InvalidNumberException;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;

/**
 * conains all calls to the data store with Registry numbers of vehicles
 */
public class RegNumberRegistry {

    private static final String[] NumberList = {"LUL123", "CXD321", "DNA144", "ABC123"};
/**
* This method compares all of the available registration numbers with the
* one the customer has entered in the view
*
* @param vehicle -  This objects contains the registration number that we need
* to compare with
*
* @return A boolean <code>valid</code> that determines whether the
* registration number is valid or not
 * @throws InvalidNumberException if the number was invalid
 */
    public static  boolean checkIfValid(VehicleDTO vehicle) throws InvalidNumberException {
        boolean valid = false;
        for (int i = 0; i < NumberList.length; i++) {
            if (vehicle.getRegNumber() == NumberList[i]) {
                valid = true;
            }
        }
        if(valid==false)
            throw new InvalidNumberException(vehicle);
        return valid;
    }

}
