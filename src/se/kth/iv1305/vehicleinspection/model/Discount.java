/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 * Holds all information for the discount
 */
public class Discount {
    private final double discountRatio = 0.8;
    private boolean isThereDiscount;
    
    /**
     * 
     * @param isThereDiscount if there is a discount or not
     */
    public Discount (boolean isThereDiscount){
        this.isThereDiscount = isThereDiscount;
    }
    
    /**
     * 
     * @return what the discord ratio is (20% hardcoded)
     */
    public double getDiscountRatio(){
        return discountRatio;
    }
    /**
     * 
     * @return true means there is a discout, false means there isnt
     */
    public boolean getDiscountBoolean(){
        return isThereDiscount;
    }
}
