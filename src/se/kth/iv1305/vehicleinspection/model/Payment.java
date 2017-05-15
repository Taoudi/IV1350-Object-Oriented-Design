/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

import se.kth.iv1305.vehicleinspection.model.Amount;
import se.kth.iv1305.vehicleinspection.model.VehicleDTO;
import se.kth.iv1305.vehicleinspection.model.VehiclePart;
import java.util.ArrayList;

/**
 *
 * Payment handles the cost of the inspection
 */
public class Payment {

    private final double costPerPart = 100;
    private Amount amountCost;
    private boolean discount = false;

    /**
     *
     * @param cost
     * @param vehicle Price goes up for every part inspected
     */
    public Payment(VehicleDTO vehicle) {
        this.amountCost = getCost(vehicle);
    }

    /**
     *
     * @return returns the cost as an amount
     */
    public Amount getAmount() {
        return amountCost;
    }

    /**
     * This method calculates the cost which is dependant on whether there is a
     * discount or not.
     *
     * @param vehicle the vehicle that is inspected
     * @return the cost of the inspection as an <code>Amount</code>
     */
    public Amount getCost(VehicleDTO vehicle) {
        Calculate calculator = new Calculator();
        if (discount == false) {
            calculator = new Calculator();
        } else if (discount == true) {
            calculator = new DiscountCalculator();
        }
        return calculator.cost(vehicle);

    }

}
