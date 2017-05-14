/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1305.vehicleinspection.integration;

/**
 * A listener interface for receiving notifications about stored results.
 * The class that is interested in such notifications implements this interface, and the object
 * created with that class is registered with <code>addResultObserver</code>. 
 * When  a car is rented that object's <code>newResult</code> method is invoked
 * 
 */
public interface ResultObserver {
    /**
     * Invoked when a result has been stored
     * 
     * @param result - The result of the inspection
     */
    void newResult(Result result);
}
