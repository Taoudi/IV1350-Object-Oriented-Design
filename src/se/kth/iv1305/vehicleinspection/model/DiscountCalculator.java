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
    private double costPerPart = 100;
    private final double discount = 0.8;
    DiscountCalculator(){      
    }
    

        /**
         * 
         * @param vehicle that is to be inspected
         * @return price of the inspection if there is a discount
         */    
    @Override
    public Amount cost(VehicleDTO vehicle) {
          return new Amount(vehicle.getListSize()*costPerPart*discount);
    }
}
