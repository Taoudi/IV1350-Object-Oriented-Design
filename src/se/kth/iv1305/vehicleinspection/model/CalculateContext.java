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
    private Calculate context;
    
    public CalculateContext(Calculate context){
        this.context = context;
    }
    
    public Amount calculate(VehicleDTO vehicle, Discount discount){
        return context.cost(vehicle, discount);
    }
}
