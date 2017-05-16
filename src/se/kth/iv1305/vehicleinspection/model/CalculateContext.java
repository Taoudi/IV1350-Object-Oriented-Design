/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 *
 * Decides which price calculation to do
 */
public class CalculateContext {

    private final Calculate context;

    /**
     *
     * @param context an instance of one implementation of the interface
     * Calculate
     */
    public CalculateContext(Calculate context) {
        this.context = context;
    }

    /**
     *
     * @param vehicle amount of parts decide price
     * @param discount is taken in consideration when calculating price
     * @return cost for the inspection
     */
    public Amount calculate(VehicleDTO vehicle, Discount discount) {
        return context.cost(vehicle, discount);
    }
}
