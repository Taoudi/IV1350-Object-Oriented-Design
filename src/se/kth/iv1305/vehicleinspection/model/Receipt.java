/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.model;

/**
 *
 * Receipt contains the information of the transaction in form of a string
 */
public class Receipt {

    private String information;

    /**
     *
     * @param information - The text that will be printed
     */
    public Receipt(String information) {
        this.information = information;
    }

    /**
     *
     * @return information of the transaction as a string
     */
    public String toString() {
        return information;
    }
}
