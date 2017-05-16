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

    private Amount amountCost;

    /**
     *
     * @param discount holds the properties for the discount object.
     * @param vehicle Price goes up for every part inspected
     */
    public Payment(VehicleDTO vehicle, Discount discount) {
        this.amountCost = getCost(vehicle, discount);
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
     * @param discount is needed to know if the price should calculate with
     * discount or not
     * @param vehicle the vehicle that is inspected
     * @return the cost of the inspection as an <code>Amount</code>
     */
    public Amount getCost(VehicleDTO vehicle, Discount discount) {
        Amount cost = new CalculateContext(new Calculator()).calculate(vehicle, discount);
        if (discount.getDiscountBoolean() == true) {
            cost = new CalculateContext(new DiscountCalculator()).calculate(vehicle, discount);
        }
        return cost;
    }

}
