/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 *  Calculates the price of the inspection normally
 */
public class Calculator implements Calculate {
    private double costPerPart = 100;
    Calculator(){
    }
    

/**
 * 
 * @param vehicle that is to be inspected
 * @return the cost of the inspection if there is not a discount
 */
    @Override
    public Amount cost(VehicleDTO vehicle) {
        return new Amount(vehicle.getListSize()*costPerPart);
    }
}
