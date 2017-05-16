/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 * Calculates the price of the inspection normally
 */
public class Calculator implements Calculate {

    private final double costPerPart = 100;

    Calculator() {
    }

    /**
     *
     * @param vehicle The price goes up for every part of the vehicle inspected
     * @param discount if there is a discount and by how much
     * @return price for the inspection
     */
    @Override
    public Amount cost(VehicleDTO vehicle, Discount discount) {
        return new Amount(vehicle.getListSize() * costPerPart);
    }

}
