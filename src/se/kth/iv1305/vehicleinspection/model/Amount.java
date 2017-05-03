/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;
/**
 *
 * This class represents a value
 */
public class Amount {
    private final double amount;
    
    /**
     * 
     * @param amount  
     */
    public Amount(double amount){
        this.amount = amount;
    }
        
    /**
     * 
     * @return return the amount as a double to be able to write it
     */
    public double getAmountAsDouble(){
        return this.amount;
    }
}
