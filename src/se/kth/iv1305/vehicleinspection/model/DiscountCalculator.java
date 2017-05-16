/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 *
 * @author taoudi
 */
public class DiscountCalculator implements Calculate {
    private final double costPerPart = 100;
    DiscountCalculator(){      
    }
   
    /**
     * 
     * @param vehicle The price goes up for every part of the vehicle inspected
     * @param discount discount if there is a discount and by how much
     * @return the price for the inspection if there is a discount
     */
    @Override
    public Amount cost(VehicleDTO vehicle, Discount discount) {
          return new Amount(vehicle.getListSize()*costPerPart*discount.getDiscountRatio());
    }
}
