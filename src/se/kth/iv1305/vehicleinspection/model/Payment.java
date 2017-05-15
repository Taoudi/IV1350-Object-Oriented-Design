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
     Amount amountCost;
     /**
      * 
      * @param cost 
      * @param vehicle 
      * Price goes up for every part inspected
      */
    public Payment (VehicleDTO vehicle){
       this.amountCost = new Amount(vehicle.getListSize()*costPerPart);
    }
    /**
     * 
     * @return cost of inspection as an instance of <code> Amount </code>
     */
       public Amount getCost(){
        return this.amountCost;
    }
    
}
